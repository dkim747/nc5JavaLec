package chap09_polymorphism;

import chap09_polymorphism.product.LgTv;
import chap09_polymorphism.product.Tv;

public class _03_withPolymorphism {

	public static void main(String[] args) {
		//1. 다형성을 이용해 Tv바꾸기
		Tv tv = new LgTv();  //new 뒤에만 바꾸면 lg <-> samsung 바꾸기 용이
		
		tv.powerOn();
		tv.operate(0);
		tv.powerOff();
		tv.powerOn();
		
		System.out.println(tv.toString());
		
	}

}
