package chap19_multithread.clazz;

public class PracticeThread {
	private int num;

	public void setNum(int num) {
		this.num = num;
	}
	
	public synchronized void printNum1(int num) {
		this.setNum(num);
		for(int i = 0; i < this.num; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public synchronized void printNum2(int num) {
		this.setNum(num);
		for(int i = 0; i < this.num; i++) {
			if(i % 3 == 1) {
				System.out.println(i);
			}
		}
	}
	
	public synchronized void printNum3(int num) {
		this.setNum(num);
		for(int i = 0; i < this.num; i++) {
			if(i % 3 == 2) {
				System.out.println(i);
			}
		}
	}
	
	
}
