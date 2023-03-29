package chap09_polymorphism;

import chap09_polymorphism.product.LgTv;
import chap09_polymorphism.product.SamsungTv;

public class _02_withoutPolymorphosm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 다형성을 사용하지 않고 많은 전자기기 운용하기
		LgTv lgtv = new LgTv();
		SamsungTv stv = new SamsungTv();
		
		lgtv.powerOn();
		lgtv.operate(13);
		lgtv.powerOff();
		lgtv.powerOn();
	}

}
