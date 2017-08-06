package thread‹bung2;

public class B‰cker implements Runnable{

String name;
int backzeit;
Pfannkuchenstapel s;
int anzahl; 
	
	 B‰cker(String name, int backzeit, Pfannkuchenstapel s){
		 this.name = name;
		 this.backzeit = backzeit;
		 this.s =s; 
		 this.run();
	}

	@Override
	public void run() {
		while (true){
			try {
				System.out.println("B‰cker hat einen neuen pfannkuchen fertig Auf dem stapel sind nun :" + s.getStapel());
				s.put();
				Thread.sleep(backzeit);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			   
	}
}
