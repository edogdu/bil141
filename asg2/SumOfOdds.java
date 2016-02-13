package asg2;

/**
 * A class finding the sum of first n odd numbers
 * 
 * @author	Arda Bölük
 * @date	2016/02/12
 */

import java.util.Scanner;

public class SumOfOdds {

	public static void main(String[] args) {

		int numOfOdds = 0; // variable holding the number of odd numbers
		int total = 0; // variable for holding the sum

		// scanner object
		Scanner keyboard = new Scanner(System.in);

		// get the number of odd numbers from the user
		System.out.println("Please enter a number (n): ");
		numOfOdds = keyboard.nextInt();

		// print the sum
		System.out.println("The sum of first n odd numbers is:\n");

		// find the sum of first n odd numbers
		for (int i = 1; i <= numOfOdds; i++) {
			total += 2 * i - 1;
			System.out.print((2 * i - 1) + ((i<numOfOdds)?"+":""));
		}

		// print the sum
		System.out.println(" = " + total);

		// close the scanner
		keyboard.close();

	}

}
