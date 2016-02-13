package asg2;

/**
 * A class for checking if the word whose initial is moved to its end is equal to its reverse
 * For example: babana, dress, potato, ...
 * 
 * @author	Arda BšlŸk
 * @date	2016/02/12
 */

import java.util.Scanner;

public class WordBackwards {

	public static void main(String[] args) {

		String current_word = ""; // variable holding the current word
		// scanner object
		Scanner scanner = new Scanner(System.in);

		// get the current word from the user
		System.out.println("Enter a word (\"quit\" to exit): ");
		current_word = scanner.next();

		// run till the word quit
		while (!current_word.equalsIgnoreCase("quit")) {

			// move the first letter to the last
			String new_word = current_word.substring(1)
					+ current_word.charAt(0);

			// spell the word backwards
			String reverse_word = "";
			for (int i = new_word.length() - 1; i >= 0; i--) {
				reverse_word += new_word.charAt(i);
			}

			// check the if original word and the word are the same
			if (current_word.equals(reverse_word)) {

				System.out.println("Yes," + current_word + "=="
						+ current_word.charAt(0) + "-"
						+ current_word.substring(1));
			} else {

				System.out.println("No," + current_word + "!="
						+ current_word.charAt(0) + "-"
						+ current_word.substring(1));
			}

			// get the current word from the user
			System.out.println("Enter a word (\"quit\" to exit): ");
			current_word = scanner.next();
		}

		System.out.println("Bye");

		// close the scanner
		scanner.close();

	}

}
