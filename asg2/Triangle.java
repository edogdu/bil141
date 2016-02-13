package asg2;

/**
 * A class for printing a triangle
 * 
 * @author	Arda Bölük
 * @date	2016/02/12
 */

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		int sizeOfTriangle = 0; // variable holding the size of the triangle
		int numOfStarsInRow = 0; // variable holding the number of stars in a
									// row
		boolean secondPartStarted = false; // true if the second part of the
											// triangle is being printed
		// scanner object
		Scanner keyboard = new Scanner(System.in);

		// get the size of the triangle from the user
		System.out.println("Please enter the size of the triangle: ");
		sizeOfTriangle = keyboard.nextInt();

		// print the triangle
		for (int i = 1; i <= 2 * sizeOfTriangle; i++) {

			// determine the number of stars in the current row
			// number of stars is equal to the current row number in the first
			// part
			// decrement the number of stars by one in the second part
			if (secondPartStarted == true) {
				numOfStarsInRow--;
			} else {
				numOfStarsInRow = i;
				if (numOfStarsInRow == sizeOfTriangle) {
					secondPartStarted = true;
				}
			}

			// print the stars
			for (int j = 0; j < numOfStarsInRow; j++) {
				System.out.print("*");
			}

			// line feed
			System.out.println();
		}

		// close the scanner
		keyboard.close();

	}

}
