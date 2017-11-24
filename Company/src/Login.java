import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.sql.*;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection=null;
	private JTextField textFieldUN;
	private JPasswordField passwordField;
	private JLabel label;
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		connection=sqliteConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 398);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setBounds(219, 34, 63, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(219, 71, 63, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		textFieldUN = new JTextField();
		textFieldUN.setBounds(292, 44, 100, 23);
		frame.getContentPane().add(textFieldUN);
		textFieldUN.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		Image img = new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		btnLogin.setIcon(new ImageIcon(img));
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					String query = "select * from EmployeeInfo where username=? and password=? ";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, textFieldUN.getText());
					pst.setString(2, passwordField.getText());
					
					ResultSet rs = pst.executeQuery();
					
					int count = 0;
					while (rs.next())
					{
						count = count+1;
					}
					
					if (count == 1)
					{
						JOptionPane.showMessageDialog(null, "Username and password is correct");
					}
					else if (count >  1)
					{
						JOptionPane.showMessageDialog(null, "Duplicate Username and password");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Username and password is not correct! Try Again! ");
					}
					
					rs.close();
					pst.close();

				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				
				}
				
			}
		});
		btnLogin.setBounds(292, 127, 100, 23);
		frame.getContentPane().add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(292, 86, 100, 20);
		frame.getContentPane().add(passwordField);
		
		label = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		label.setIcon(new ImageIcon(img1));
		label.setBounds(10, 34, 200, 228);
		frame.getContentPane().add(label);
	}
}
