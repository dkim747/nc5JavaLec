package chap19_multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _16_threadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		printThread t1 = new printThread();
		printThread t2 = new printThread();
		
		t1.settName("스레드 1번");
		t2.settName("스레드 2번");
		
		for(int i = 0; i < 10; i++) {
			es.execute(t1);
			es.execute(t2);
			
			if(i > 8) {
				es.shutdownNow();
				break;
			}
		}
	}

}

class printThread extends Thread{
	
	public String tName;
	
	public printThread(String tName) {
		this.tName = tName;
	}
	
	public void settName(String tname) {
		tName = tname;
	}

	@Override
	public void run() {
		System.out.println(tName + " 작업 진행");
		
		try {
			Thread.sleep(300);
		}catch(InterruptedException ie) {
			System.out.println(tName + "shutdownNow() 호출");
		}
	}
}
