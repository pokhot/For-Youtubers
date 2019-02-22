
package applets_egs;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.DO_NOTHING_ON_CLOSE;

 
public class BorderLayoutDemo { 
JFrame f; 
BorderLayoutDemo()//constructor
{ 
f=new JFrame(); 
JButton b1=new JButton("NORTH");; 
JButton b2=new JButton("SOUTH");; 
JButton b3=new JButton("EAST");; 
JButton b4=new JButton("WEST");; 
JButton b5=new JButton("CENTER");; 

f.add(b1,BorderLayout.NORTH); 
f.add(b2,BorderLayout.SOUTH); 
f.add(b3,BorderLayout.EAST); 
f.add(b4,BorderLayout.WEST); 
f.add(b5,BorderLayout.CENTER);

f.setSize(300,300);
f.setVisible(true); 
f.setDefaultCloseOperation(EXIT_ON_CLOSE);//it vil exit when v click on close sign of frame
} 
public static void main(String[] args) 
{ 
new BorderLayoutDemo();
}
} 

