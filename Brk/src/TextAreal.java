import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextAreal implements ActionListener {
	
	JTextArea text;
	
	public static void main(String[] args)
	{
		TextAreal gui = new TextAreal(); // pravljenje guia
		gui.go();   // povezivanje gui-a sam etodom
	}
	public void go(){
		JFrame frame = new JFrame();  // pravljenje frejma
		JPanel panel = new JPanel();  // pravljenje panela
		JButton button = new JButton("JUST CLICK IT!");  // pravljenje dugmeta za kliktanje
		button.addActionListener(this);  // povezivanje dugmeta sa osluskivacem
		text = new JTextArea(10,20);  // podesavanje velicine text prostora
		text.setLineWrap(true);   // prelazenje u novi red u tekst prostoru
		// pravljenje horizontalnog i vertikalnog klizaca
		JScrollPane scroller =  new JScrollPane(text);  // pravljenje scroll panela
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel.add(scroller); // dodavanje klizaca na panel
		
		frame.getContentPane().add(BorderLayout.CENTER, panel);  // postavljenje panela na centar
		frame.getContentPane().add(BorderLayout.SOUTH, button);  // postalvjenje dugmeta na jug
		
		frame.setSize(350,300);  // postavljanje velicine prozora kompletnog
		frame.setVisible(true);	// postavljanje da bude vidljiv prozor
	}
	public void actionPerformed(ActionEvent ev)  // metoda koja treba da se desi nakon kliktaja
	{
		text.append("button clicked \n "); // ispisuje poruku button clicked
	}
}