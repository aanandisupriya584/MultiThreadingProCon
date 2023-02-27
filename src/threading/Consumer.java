package threading;

public class Consumer extends Thread{
	Company c;
	Consumer(Company c){
		this.c=c;
	}
	public void run() {
		while(true) {
		this.c.consume_item(MAX_PRIORITY);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}
}
	
