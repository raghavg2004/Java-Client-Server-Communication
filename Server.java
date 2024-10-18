import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] javaargs) {
        try {
            ServerSocket serverSocket = new ServerSocket(5001);
            System.out.println("Server started. Waiting for client...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

                    /* InputStream i= clientSocket.getInputStream();
						   
			  InputStreamReader t=new InputStreamReader(i);
						   
			  BufferedReader reader = new BufferedReader(t);*/
						   
			    BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
						   
						   
			  /*OutputStream o=clientSocket.getOutputStream();
						   
			  PrintWriter writer=new PrintWriter(o);*/
          					
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
		   
	   InputStreamReader y=new InputStreamReader(System.in);
	   BufferedReader consoleReader = new BufferedReader(y);

          /*  BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));*/

            String receivedMessage;
            String sendMessage;
			

            while (true) {
                // Reading message from client
                receivedMessage = reader.readLine();
                System.out.println("Client: " + receivedMessage);
				
				
                // Check if client wants to end the connection
                if (receivedMessage.equalsIgnoreCase("bye")) {
                    break;
                }

                // Sending message to client
                System.out.print("Server: ");
                sendMessage = consoleReader.readLine();
                writer.println(sendMessage);
            }

            // Close all resources
           
            System.out.println("Server closed.");
        } catch (Exception e) {
           e.printStackTrace();
        }
		finally
		{
			 
		}
    }
}
