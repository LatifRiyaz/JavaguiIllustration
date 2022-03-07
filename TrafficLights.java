import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLights extends JFrame implements ActionListener{

    JFrame frame;
    JRadioButton r1, r2, r3;
            
    TrafficLights(){
        
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(300,400);
	this.setLayout(null);
        this.getContentPane().setBackground(Color.BLACK);      

	r1 = new JRadioButton("Red");
	r2 = new JRadioButton("Yellow");
	r3 = new JRadioButton("Green");
        
        r1.setBounds(100, 120, 100, 50);
        r1.setForeground(Color.RED);
        r1.setBackground(Color.BLACK);
        
	r2.setBounds(100, 155, 100, 50);
        r2.setForeground(Color.YELLOW);	
        r2.setBackground(Color.BLACK);
        
	r3.setBounds(100, 185, 100, 50);
        r3.setForeground(Color.GREEN);
        r3.setBackground(Color.BLACK);

	ButtonGroup group = new ButtonGroup();
	group.add(r1);
	group.add(r2);
	group.add(r3);

	r1.addActionListener(this);
	r2.addActionListener(this);
	r3.addActionListener(this);        
        
	this.add(r1);
	this.add(r2);
	this.add(r3);
	this.setVisible(true);
	this.setFocusable(true);
    }
    
    public static void main(String args[]){
        
	TrafficLights tl = new TrafficLights();		
    }

    @Override
    public void actionPerformed(ActionEvent e){

         if(e.getSource() == r1){
             
               JOptionPane.showMessageDialog(frame,"Stop");
         }

         else if(e.getSource() == r2){

               JOptionPane.showMessageDialog(frame,"Ready");
         }
         
         else{

               JOptionPane.showMessageDialog(frame,"Go");
         }
    }
}