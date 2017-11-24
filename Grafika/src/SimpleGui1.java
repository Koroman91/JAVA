import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.awt.image.ImageObserver;

public class SimpleGui1 implements ActionListener {
	JButton button;
	public static void main(String[] args)
	{
		SimpleGui1 gui = new SimpleGui1();
		gui.go();
	}
	public void go()
	{
		JFrame frame  = new JFrame();
		button = new JButton("click me");
		
	    button.addActionListener(this);
	    
	    frame.getContentPane().add(BorderLayout.WEST, button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.orange);
		g.fillRect(20,50,100,100);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		button.setText("I've been clicked!");
	}

}
