package logInScreenMYSQL;

public class Main {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			
			public void run() {
				GUI logInObject = new GUI();
			}
		});
		
		thread.start();
	}
}
