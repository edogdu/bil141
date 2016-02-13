package asg1;

/**
 * A class simulating a bouncing ball
 * 
 * @author	Arda Bölük
 * @date	2016/02/12
 */

import java.util.Scanner;

public class Bounce {

	public static void main(String[] args) {

		int time = 0; // variable for the time
		int bounce_counter = 0; // variable for the number of bounces
		final int bounce_limit = 5; // constant for the bounce limit
		double height = 0; // variable for the height
		double velocity = 0.0; // variable for the velocity
		final double acceleration = -32.0; // constant for the acceleration

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter the initial velocity of the ball: ");

		// get the initial velocity from the user
		velocity = keyboard.nextDouble();

		// simulate the bouncing ball
		while (bounce_counter <= bounce_limit) {

			if (height < 0) {
				// write bounce
				System.out.println("Bounce!");
				// simulate the bounce
				velocity *= -0.5;
				height *= -0.5;
				// increment the bounce counter by 1
				bounce_counter++;
			} else {
				// print the time and height
				System.out.println("Time: " + time + " Height: " + height);
				// advance the height and the velocity
				height += velocity;
				velocity += acceleration;
				// advance the time
				time++;
			}
		}

		// close the scanner
		keyboard.close();

	}

}
