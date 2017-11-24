import javax.swing.*;
import java.awt.*;

public class Panel{
	public static void main(String[] args){
		Panel gui = new Panel();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JButton button = new JButton("Click This!");
		JButton buttonTwo = new JButton("bliss");
		panel.add(button);
		panel.add(buttonTwo);
		//Font bigFont = new Font("sherif", Font.BOLD, 28);
		//button.setFont(bigFont);
		frame.getContentPane().add(BorderLayout.EAST,panel);
		frame.setSize(250,200);
		frame.setVisible(true);
	}
	
	}
	

