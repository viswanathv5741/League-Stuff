package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener{
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JButton add = new JButton("Add task");
	private JButton remove = new JButton("Remove task");
	private JButton save = new JButton("Save");
	private JButton load = new JButton("Load");
	
	public ToDoList() {
		panel.add(add);
		panel.add(remove);
		panel.add(save);
		panel.add(load);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		add.addActionListener((ActionListener) this);
		remove.addActionListener((ActionListener) this);
		save.addActionListener((ActionListener) this);
		load.addActionListener((ActionListener) this);
	}
	
	public static void main(String[] args) {
		ToDoList test = new ToDoList();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(add)) {
			String task = JOptionPane.showInputDialog("Enter a task to add onto the to-do list");
			try {
				FileReader fr = new FileReader("src/intro_to_file_io/ToDoList.txt");
				int x = fr.read();
				String list = task + "\n";
				while (x != -1) {
					list += (char)x;
					x = fr.read();
				}
				fr.close();
				FileWriter fw = new FileWriter("src/intro_to_file_io/ToDoList.txt");
				fw.write(list);
				fw.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		if (e.getSource().equals(remove)) {
			String remove = JOptionPane.showInputDialog("What would you like to remove?");
			try {
				String new_list = "";
				//FileReader fr = new FileReader("src/intro_to_file_io/ToDoList.txt");
				Scanner scanner = new Scanner(new File("src/intro_to_file_io/ToDoList.txt"));
				while (scanner.hasNextLine()) {
					String line = scanner.nextLine();
					if (!line.equals(remove)) {
						new_list += line + "\n";
					}
				}
				scanner.close();
				FileWriter fw = new FileWriter("src/intro_to_file_io/ToDoList.txt");
				fw.write(new_list);
				fw.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource().equals(save)) {
			try {
				FileReader fr = new FileReader("src/intro_to_file_io/ToDoList.txt");
				int x = fr.read();
				String list = "";
				while (x != -1) {
					list += (char)x;
					x = fr.read();
				}
				fr.close();
				FileWriter fw = new FileWriter("src/intro_to_file_io/ToDoList.txt");
				fw.write(list);
				fw.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource().equals(load)) {
			try {
				FileReader fr = new FileReader("src/intro_to_file_io/ToDoList.txt");
				int x = fr.read();
				String list = "";
				while (x != -1) {
					list += (char)x;
					x = fr.read();
				}
				fr.close();
				JOptionPane.showMessageDialog(null, list);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
