package asg3;

/**
 * Tester class for the grade distribution
 * 
 * @author Arda Bölük
 * @date 2016/02/12
 */

public class GradeDistributionTest {

	public static void main(String[] args) {

		// create two GradeDistribution objects
		GradeDistribution grades1 = new GradeDistribution();
		GradeDistribution grades2 = new GradeDistribution();

		// set the number of grades
		grades1.readGrades();
		grades2.setGrades(5, 10, 15, 20, 25);

		// print the percentages
		System.out.println("Percentages of the grades1, in order:");
		System.out.println(grades1.perA() + " " + grades1.perB() + " "
				+ grades1.perC() + " " + grades1.perD() + " " + grades1.perF());
		System.out.println("Percentages of the grades2, in order:");
		System.out.println(grades2.perA() + " " + grades2.perB() + " "
				+ grades2.perC() + " " + grades2.perD() + " " + grades2.perF());

		// draw the graph
		grades1.drawGraph();
		System.out.println("\n\n\n\n");
		grades2.drawGraph();

	}

}
