package chap19_multithread.clazz;

public class PrintNumOneToTwenty {
	
	private int num;

	public void setNum(int num) {
		this.num = num;
	}
	
	public synchronized void printnum1(int num) {
		this.setNum(num);
		for(int i = 0; i <= this.num; i++) {
			if(i % 2 == 1) {				
				System.out.println("스레드 1 - " + i);				
				notify();
				
				try {
					wait();
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}			
			
		}
	}
	
	public synchronized void printnum2(int num) {
		this.setNum(num);
		for(int i = 1; i <= this.num; i++) {
			if(i % 2 == 0) {
				System.out.println("스레드 2 - " + i);
				notify();	
				
				try {
					wait();
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				}
		}
	}
}
