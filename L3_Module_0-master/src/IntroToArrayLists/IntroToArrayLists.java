package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> greetings = new ArrayList<>(); 
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		greetings.add("Hi");
		greetings.add("Hello");
		greetings.add("Goodbye");
		greetings.add("Greetings");
		greetings.add("Good night");
		
		//3. Print all the Strings using a standard for-loop
		for (int i=0; i < greetings.size(); i++) {
			System.out.println(greetings.get(i));
		}
		
		//4. Print all the Strings using a for-each loop
		for (String items : greetings) {
			System.out.println(items);
		}
		
		
		//5. Print only the even numbered elements in the list.
		for (int i=0; i < greetings.size(); i=i+2) {
			System.out.println(greetings.get(i));
		}
		
		//6. Print all the Strings in reverse order.
		for (int i=greetings.size() -1; i>=0; i--) {
			System.out.println(greetings.get(i));
		}
	
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i=0; i < greetings.size(); i++) {
			String word = greetings.get(i);
			for (int j=0; j < word.length(); j++) {
				if (word.charAt(j) == 'e') {
					System.out.println(word);
					j= word.length();
				}
			}
		}
		
	}
}
