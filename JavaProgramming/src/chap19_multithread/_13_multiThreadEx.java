package chap19_multithread;

import chap19_multithread.clazz.PracticeThread1;
import chap19_multithread.clazz.PracticeThread2;
import chap19_multithread.clazz.PracticeThread3;

public class _13_multiThreadEx {

	public static void main(String[] args) {
		
		PracticeThread1 p1 = new PracticeThread1();
		PracticeThread2 p2 = new PracticeThread2();
		PracticeThread3 p3 = new PracticeThread3();
		
		p1.setPn1(num);
		p2.setPn1(pn1);
		p3.setPn1(pn1);
		
		
		p1.start();
		
		try {
			p1.join();
			p2.start();
			p2.join();
			p3.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
