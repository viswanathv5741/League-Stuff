package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton button1 = new JButton("Add Name");
	static JButton button2 = new JButton("View Names");
	ArrayList<String> names = new ArrayList<>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	public GuestBook() {
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	public static void main(String[] args) {
	GuestBook book = new GuestBook();	
		

	}
	

	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(button1)) {
			String new_name = JOptionPane.showInputDialog("Enter a name");
			names.add(new_name);
		}
		else if (e.getSource().equals(button2)) {
			String format = "";
			for (int i=0; i < names.size(); i++) {
				format += names.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, format);
			//System.out.println(names);
		}
	}
}
