package IntroToHashMaps;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;

public class LogSearch implements ActionListener {
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JButton add = new JButton("Add member");
	private JButton search_ID = new JButton("Search member");
	private JButton view = new JButton("View members");
	private JButton remove = new JButton("Delete a member");
	HashMap<Integer, String> search = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		LogSearch test = new LogSearch();
		
	}
	
	public LogSearch() {
		panel.add(add);
		panel.add(search_ID);
		panel.add(view);
		panel.add(remove);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		add.addActionListener(this);
		search_ID.addActionListener(this);
		view.addActionListener(this);
		remove.addActionListener(this);
	}
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(add)) {
			Integer entry = Integer.parseInt(JOptionPane.showInputDialog("Enter an ID number"));
			String name = JOptionPane.showInputDialog("Enter a name");
			search.put(entry, name);
		}
		if (e.getSource().equals(search_ID)) {
			String format = "";
			Integer entry = Integer.parseInt(JOptionPane.showInputDialog("Enter an ID number"));
			if (!(search.get(entry) == null)) {
				format = search.get(entry);
				JOptionPane.showMessageDialog(null, format);
			}
			else {
				JOptionPane.showMessageDialog(null, "No such person exists.");
			}
			
		}
		if (e.getSource().equals(view)) {
			String format = "";
			for (int a: search.keySet()) {
				format += "ID: " + a + " Name: " + search.get(a) + "\n";
			}
			JOptionPane.showMessageDialog(null, format);
		}
		if (e.getSource().equals(remove)) {
			String format = "";
			int size = search.size();
			Integer ID = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID of the person to be removed"));
			for (int a: search.keySet()) {
				search.remove(ID);
			}
			if (!(search.size() < size)) {
				JOptionPane.showMessageDialog(null, "There is no one with this ID");
			}
		}
		
		
	}
	
}
