package thread‹bung2;

public class Esser implements Runnable {
	
	String name;
	int speed;
	Pfannkuchenstapel s;

	Esser(String name,  int speed, Pfannkuchenstapel s){
		this.name = name;
		this.speed = speed;
		this.s = s;
		
	}
	
	@Override
	public void run() {
 		while (true) {
 			s.get();
 			System.out.println("Esser nimmt pfannkuchen");
 			
		}
	}

}
