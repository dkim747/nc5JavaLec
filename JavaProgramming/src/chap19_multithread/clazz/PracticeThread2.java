package chap19_multithread.clazz;

public class PracticeThread2 extends Thread {
	
	private PracticeThread num;

	public PracticeThread getPn1() {
		return num;
	}

	public void setPn1(PracticeThread num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		num.printNum2(10);
	}
}
