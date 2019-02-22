/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applets_egs;

/**
 *
 * @author Pooja M Khot
 */
import java.awt.Button;
import java.awt.Frame;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class BoxLayoutDemo extends Frame { 
Button buttons[]; 

public BoxLayoutDemo () 
{ 
buttons = new Button [5]; 
for (int i = 0;i<5;i++) 
{ 
buttons[i] = new Button ("Button " + (i + 1)); 
add (buttons[i]); 
} 
setLayout (new BoxLayout (this, BoxLayout.X_AXIS)); 
setSize(400,400); 
setVisible(true);
} 
public static void main(String args[]){ 
BoxLayoutDemo b=new BoxLayoutDemo(); 

} } 

