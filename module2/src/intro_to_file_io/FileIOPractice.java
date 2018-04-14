package intro_to_file_io;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOPractice {
	public static void main(String[] args) {
		// activity 1
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Message:");
		String note = keyboard.next();
		String encrypt = "";
		for (int i=0; i<note.length(); i++) {
			char c= (char) (note.charAt(i) + 1);
			encrypt += c;
		}
		
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt");
			fw.write(encrypt);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// activity 2
		try {
			FileReader fr = new FileReader("src/encryptedLetters.txt");
			int x = fr.read();
			String decrypt = "";
			while (x != -1) {
				char c = (char) (x - 1);
				decrypt += c;
				x = fr.read();
			}
			System.out.println(decrypt);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// activity 3
		try {
			FileReader fr = new FileReader("src/intro_to_file_io/JunkFile.java");
			int x = fr.read();
			String file = "//copyright © 2018 by Vainavi Viswanath \n";
			while (x != -1) {
				file += (char)x;
				x = fr.read();
			}
			fr.close();
			FileWriter fw = new FileWriter("src/intro_to_file_io/JunkFile.java");
			fw.write(file);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
