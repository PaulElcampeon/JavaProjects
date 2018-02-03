package paulsBookStoreV2;

public class Main implements Runnable{

	@Override
	public void run() {

		BookShop obj = new BookShop();
	}
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Main());
		thread.start();
	
	}

	
}
