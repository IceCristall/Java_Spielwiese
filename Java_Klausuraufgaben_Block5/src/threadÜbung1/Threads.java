package thread‹bung1;

public class Threads implements Runnable {

	private int loops;
	private int wait;
	private Counter counter;

	public Threads(int loops, int wait, Counter counter) {
		this.loops = loops;
		this.wait = wait;
		this.counter = counter;

	}

	@Override
	public void run() {
		for (int i = 0; i < loops; i++) {
			System.out.printf("Thread '%s' \t %d%n", Thread.currentThread().getName(), counter.runCounter());
			try {
				Thread.sleep(wait);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
