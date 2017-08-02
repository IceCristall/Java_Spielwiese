package thread‹bung2;

public class Pfannkuchenstapel {
	int anzahl = 0;
	int stapelMax = 0;

	Pfannkuchenstapel(int max) {
		this.stapelMax = max;
	}

	public synchronized void put() throws InterruptedException {
		while (anzahl == stapelMax) {
			wait();
			anzahl++;
			System.out.println("Pfannkuchen auf Stapel: " + anzahl);
			notify();

		}

	}

	public synchronized void get() {
		while (anzahl == 0) {
			anzahl--;
			System.out.println("Pfannkuchen auf Stapel" + anzahl);
			notify();
		}
	}

	public int getStapel() {
		return anzahl;
	}
}
