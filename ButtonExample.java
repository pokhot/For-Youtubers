/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applets_egs;


import java.awt.event.*;  
    import javax.swing.*;   

    public class ButtonExample {  
        
    public static void main(String[] args) {  
        
        JFrame f=new JFrame("Button Example"); //name of frame
        
        final JTextField tf=new JTextField();  
        tf.setBounds(50,50, 150,20);  
        JButton b=new JButton("Click Here");  
        b.setBounds(50,100,95,30);  
        b.addActionListener(new ActionListener()
        {  
    public void actionPerformed(ActionEvent e){  
                tf.setText("Welcome to SPARK");  
            }  
        });  
        f.add(b);
        f.add(tf);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    }  
    
    }  

