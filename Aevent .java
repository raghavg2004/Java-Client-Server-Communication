import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class AEvent extends JFrame  {
    JTextField tf;
    AEvent(){

//create components
        tf=new JTextField();
        tf.setBounds(60,50,170,20);
        JButton b=new JButton("click me");
        b.setBounds(100,120,80,30);
BCD x=new BCD();
//register listener
        b.addActionListener(x);//passing current instance

//add components and set size, layout and visibility
        add(b);
		add(tf);
        setSize(300,300);
setLayout(null);
        setVisible(true);
	
    }

public static void main(String args[]){
        new AEvent();
    }


b.addActionListener(new ActionListener(){
public void actionPerformed(){
        tf.setText("hello");
        }
        });
class BCD implements ActionListener
{
	public void actionPerformed(ActionEvent r){

		tf.setText("hello");
		
        }
}
}

