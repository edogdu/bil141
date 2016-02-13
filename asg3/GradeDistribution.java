package asg3;

/**
 * A class providing operations on histogram of a grade distribution
 * 
 * @author	Arda Bölük
 * @date	2016/02/12
 */

import java.util.Scanner;

public class GradeDistribution {

	int numA;
	int numB;
	int numC;
	int numD;
	int numF;
	double totalGrades;

	// default constrcutor
	public GradeDistribution() {

		numA = 0;
		numB = 0;
		numC = 0;
		numD = 0;
		numF = 0;
		totalGrades = 0;
	}

	// set the number of grades
	public void setGrades(int numA, int numB, int numC, int numD, int numF) {

		this.numA = numA;
		this.numB = numB;
		this.numC = numC;
		this.numD = numD;
		this.numF = numF;
		totalGrades = numA + numB + numC + numD + numF;
	}

	// read the number of grades from the user
	public void readGrades() {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the number of grades for each grade (A,B,C,D,F):");

		numA = keyboard.nextInt();
		numB = keyboard.nextInt();
		numC = keyboard.nextInt();
		numD = keyboard.nextInt();
		numF = keyboard.nextInt();
		totalGrades = numA + numB + numC + numD + numF;

		keyboard.close();
	}

	// percentage of A
	public int perA() {

		return (int) Math.round((numA / totalGrades) * 100);
	}

	// percentage of A
	public int perB() {

		return (int) Math.round((numB / totalGrades) * 100);
	}

	// percentage of C
	public int perC() {

		return (int) Math.round((numC / totalGrades) * 100);
	}

	// percentage of D
	public int perD() {

		return (int) Math.round((numD / totalGrades) * 100);
	}

	// percentage of F
	public int perF() {

		return (int) Math.round((numF / totalGrades) * 100);
	}

	// draw the graph
	public void drawGraph() {

		// print the ruler
		System.out
				.println("0    10   20   30   40   50   60   70   80   90   100");
		System.out
				.println("|    |    |    |    |    |    |    |    |    |    |");
		System.out
				.println("***************************************************");

		// stars for A
		for (int i = 0; i < Math.round(((numA / totalGrades) * 100) / 2); i++) {
			System.out.print("*");
		}
		System.out.println(" A");

		// stars for B
		for (int i = 0; i < Math.round(((numB / totalGrades) * 100) / 2); i++) {
			System.out.print("*");
		}
		System.out.println(" B");

		// stars for C
		for (int i = 0; i < Math.round(((numC / totalGrades) * 100) / 2); i++) {
			System.out.print("*");
		}
		System.out.println(" C");

		// stars for D
		for (int i = 0; i < Math.round(((numD / totalGrades) * 100) / 2); i++) {
			System.out.print("*");
		}
		System.out.println(" D");

		// stars for A
		for (int i = 0; i < Math.round(((numF / totalGrades) * 100) / 2); i++) {
			System.out.print("*");
		}
		System.out.println(" F");
	}

}
