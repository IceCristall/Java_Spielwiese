package thread�bung2;

public class PfannkuchenEssen {

	public static void main(String[] args) {

		Pfannkuchenstapel s = new Pfannkuchenstapel(3);
		
		B�cker b�cker1 = new B�cker("Mutter", 19999, s);
		B�cker b�cker2 = new B�cker("Sternekoch",10000,s);
		
		Esser esser1 = new Esser("testesser1",20000 ,s);
		Esser esser2 = new Esser("testesser2",15900 ,s);
		Esser esser3 = new Esser("testesser3",30000 ,s);
		
		do {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (s.getStapel() < 3);

		System.out.println("Das Essen startet");
		esser1.run();
		esser2.run();
		esser3.run();
		
		
	}

}
