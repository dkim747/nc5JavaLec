package chap19_multithread.clazz;

public class PrintNumWithWaitNotify {
	
	private int num;

	public void setNum(int num) {
		this.num = num;
	}
	
	//동기화 메소드
	public synchronized void printNum1(int num) {
			this.setNum(num);
		
		for (int i = 1; i <= this.num; i++) {
			System.out.println(i);
			notify(); //다른 스레드를 실행대기상태로 변경
					  //wait()가 호출되어 일시정지 상태로 변경 되기 전에 호출해야한다.
			try {
				wait(); //자신을 일시 정지 상태로 변경
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
			
	public synchronized void printNum2(int num) {
		//동기화 블록 : 선점한 스레드의 작업이 끝날때 까지 실행 안되도록 동기화 블록 선언
		synchronized(this) {
			this.setNum(num);			
		}

		for (int i = this.num; i <= this.num * 2; i++) {
			System.out.println(i);
			notify(); // 다른 스레드를 실행대기상태로 변경
			// wait()가 호출되어 일시정지 상태로 변경 되기 전에 호출해야한다.
			try {
				wait(); // 자신을 일시 정지 상태로 변경
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
