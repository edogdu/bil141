package asg3;

/**
 * Tester class for the Counter
 * 
 * @author Arda Bölük
 * @date 2016/02/12
 */

public class CounterTest {

	public static void main(String[] args) {

		// create a counter object
		Counter myCounter = new Counter();

		// test the print method
		myCounter.printCount();
		// increment the counter value three times
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();
		// test the get method
		System.out.println("The counter value from system out: "
				+ myCounter.getCount());
		// decrement the counter two times
		myCounter.decrement();
		myCounter.decrement();
		// print the counter value
		myCounter.printCount();
		// reset the counter
		myCounter.reset();
		// print the counter value
		System.out.println("The counter value from system out: "
				+ myCounter.getCount());

	}

}
