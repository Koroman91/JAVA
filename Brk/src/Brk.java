import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
//import java.awt.EventQueue;

//import javax.swing.JFrame;


public class Brk implements ActionListener {

	 JFrame frame;
	 //JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	 Brk gui = new Brk();
	 gui.go();
	}
    public void go(){
    	frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	JButton button = new JButton("Change Colors");
    	button.addActionListener(this);
    	
    	MyDrawPanel drawPanel = new MyDrawPanel();
    	frame.getContentPane().add(BorderLayout.SOUTH, button);
    	frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
    	frame.setSize(300,300);
    	frame.setVisible(true);
    }
	   class MyDrawPanel extends JPanel{
		   public void paintComponent(Graphics g) {
			   Graphics2D g2d = (Graphics2D) g;
			   
			   int red =  (int) (Math.random() * 255);
			   int green =  (int) (Math.random() * 255);
			   int blue =  (int) (Math.random() * 255);
			   Color startColor = new Color(red, green, blue);
			   
			   red =  (int) (Math.random() * 255);
			   green =  (int) (Math.random() * 255);
			   blue =  (int) (Math.random() * 255);
			   Color endColor = new Color(red, green, blue);
			   GradientPaint gradient = new GradientPaint(70,70, startColor, 150,150, endColor);
			   g2d.setPaint(gradient);
			   g2d.fillOval(70,70,100,100);
			   
			   
		   }


	   }
	@Override
	public void actionPerformed(ActionEvent event) {
		frame.repaint();
		// TODO Auto-generated method stub
		
	}
	
	}
