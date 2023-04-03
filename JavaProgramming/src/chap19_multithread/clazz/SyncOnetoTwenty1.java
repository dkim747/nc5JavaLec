package chap19_multithread.clazz;

public class SyncOnetoTwenty1 extends Thread{
	
	private PrintNumOneToTwenty pnot;

	public void setPnot(PrintNumOneToTwenty pnot) {
		this.pnot = pnot;
	}
	
	public PrintNumOneToTwenty pnot() {
		return pnot;
	}
	
	@Override
	public void run() {
		pnot.printnum1(20);
	}
	
}
