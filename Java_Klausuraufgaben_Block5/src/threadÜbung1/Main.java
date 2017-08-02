package threadÜbung1;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		Threads a = new Threads(25,1,c1);
		Threads b = new Threads(25,1,c2);
		Thread ta = new Thread(a,"A");
		Thread tb = new Thread(b,"b");
		
		ta.start();
		tb.start();
		ta.join();
		tb.join();
		
	}

}
