package chap19_multithread;

import chap19_multithread.clazz.NonSyncThread1;
import chap19_multithread.clazz.NonSyncThread2;
import chap19_multithread.clazz.PrintNumWithoutSync;

public class _08_nonSyncShareObj {

	public static void main(String[] args) {
		
		PrintNumWithoutSync pns = new PrintNumWithoutSync();
		
		NonSyncThread1 nst1 = new NonSyncThread1();
		NonSyncThread2 nst2 = new NonSyncThread2();
		
		nst1.setPns(pns);
		nst2.setPns(pns);
		
		
		//동기화되지 않은 객체의 변수는 첫 스레드가 선점해도 두번째 스레드에서 값을 변경할 수 있어서
		//개발자가 의도한 결과와 다른값이 나올수 있다.
		//원하는 결과 : 1 ~ 10 까지 출력
		//출력 결과 : 1 ~ 20까지 출력
		//선점한 스레드가 사용중일떄는 다른 스레드에서 사용 못하게 잠금처리(동기화)해야한다.
		nst1.start();
		nst2.start();
		
		
	}

}
