package threadÜbung1;

public class Counter {

	public static int counterClass = 0;
	private int counter;

	Counter() {
		counter = 0;
	}

	public int runCounter() {
		for (int i = 0; i < 1000; i++) {
			counter++;
		}
		for (int i = 0; i < 1000; i++) {
			counterClass++;
		}
		return counter;
	}

	public int getCounter() {
		return counter;
	}
}
