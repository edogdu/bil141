package asg3;

/**
 * A class simulating a counter
 * 
 * @author Arda BšlŸk
 * @date 2016/02/12
 */

public class Counter {

	private int counterValue;

	// default constructor
	public Counter() {
		counterValue = 0;
	}

	// method that resets the counter value
	public void reset() {
		counterValue = 0;
	}

	// method that increments the counter value by one
	public void increment() {
		counterValue++;
	}

	// method that decrements the counter value by one
	public void decrement() {
		if (counterValue > 0) {
			counterValue--;
		}
	}

	// method that returns the current value of the counter
	public int getCount() {
		return counterValue;
	}

	// method that displays the counter value on the screen
	public void printCount() {
		System.out.println("The counter value is: " + counterValue);
	}
}
