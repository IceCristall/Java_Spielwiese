package thread‹bung2;

public class PfannkuchenEssen {

	public static void main(String[] args) {

		Pfannkuchenstapel s = new Pfannkuchenstapel(3);
		
		B‰cker b‰cker1 = new B‰cker();
		B‰cker b‰cker2 = new B‰cker();
		
		Esser esser1 = new Esser();
		Esser esser2 = new Esser();
		Esser esser3 = new Esser();
		
		do {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (s.getStapel() < 3);

		System.out.println("Das Essen startet");
//		esser1.start();
//		esser2.start();
//		esser3.start();
		
		
	}

}
