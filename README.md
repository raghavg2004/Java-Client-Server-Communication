# Java Client-Server Communication

## Project Overview

This is a mini-project demonstrating client-server communication using Java. The project allows a client and a server to communicate with each other via the command-line interface (CMD). The server listens for client requests, and the client can send messages to the server. The server responds accordingly, allowing for two-way communication.

## Features
- **Client-Server Communication**: The client can send messages to the server, and the server responds.
- **Command-Line Interface**: Interaction happens through the CMD terminal.
- **Socket Programming**: The project is built using Java's `Socket` and `ServerSocket` classes for network communication.
- **Simple Protocol**: A basic text-based protocol for sending and receiving messages between client and server.

## How it Works

1. The server is started and listens on a specific port for incoming connections from clients.
2. The client connects to the server via the specified IP address and port.
3. The client can send messages to the server.
4. The server processes the messages and responds to the client.
5. Communication continues until the client or server terminates the connection.

## Prerequisites

- **Java**: Make sure you have Java installed. You can check by running:
  ```bash
  java -version
  ```

## Installation

1. Clone the repository to your local machine:
    ```bash
    git clone https://github.com/raghavg2004/Java-Client-Server-Communication.git
    ```
2. Compile the Java Files: Open a terminal and navigate to the project directory. Compile the server and client Java files:
    ```
    javac Server.java
    javac Client.java
    ```
3. Run the Server: In the terminal, start the server:
    ```
    java Server
    ```
4. Run the Client: Open another terminal window and start the client:
    ```
    java Client
    ```
6. Test the Communication: You can now send messages from the client to the server via CMD. The server will process the messages and respond.


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
