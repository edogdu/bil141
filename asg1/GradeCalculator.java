package asg1;

/**
 * A class for calculating the grade distributions
 * 
 * @author	Arda Bölük
 * @date	2016/02/12
 */

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {

		// variables that hold the count of each grade
		int numA = 0;
		int numB = 0;
		int numC = 0;
		int numD = 0;
		int numF = 0;
		int total_num_of_grades = 0;

		// scanner object for getting input from user
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the grades (0-100, seperated by whitespace, ending with -1):");

		// current grade
		int current_grade = scanner.nextInt();

		// get the grades from the user and count them
		while (current_grade != -1) {

			if (current_grade >= 90 && current_grade <= 100) {
				numA++;
			} else if (current_grade >= 80 && current_grade <= 89) {
				numB++;
			} else if (current_grade >= 70 && current_grade <= 79) {
				numC++;
			} else if (current_grade >= 60 && current_grade <= 69) {
				numD++;
			} else if (current_grade >= 0 && current_grade <= 59) {
				numF++;
			}

			current_grade = scanner.nextInt();

			total_num_of_grades++;
		}

		// print the count of the grades to the screen
		System.out.println("Total number of grades = " + total_num_of_grades);
		System.out.println("Number of A's = " + numA);
		System.out.println("Number of B's = " + numB);
		System.out.println("Number of C's = " + numC);
		System.out.println("Number of D's = " + numD);
		System.out.println("Number of F's = " + numF);

		// close the scanner
		scanner.close();

	}

}
