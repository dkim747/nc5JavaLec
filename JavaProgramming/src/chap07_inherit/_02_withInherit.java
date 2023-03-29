package chap07_inherit;

import chap07_inherit.car.Car;
import chap07_inherit.car.HyundaiCar;
import chap07_inherit.car.HyundaiCarInherit;
import chap07_inherit.car.KiaCar;
import chap07_inherit.car.KiaCarInherit;

public class _02_withInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		KiaCar kCar = new KiaCar();
		HyundaiCar hCar = new HyundaiCar();
		
		car.company = "GM";
		kCar.company = "Kia";
		hCar.company = "Hyundai";
		
		Car car1 = new KiaCarInherit();
		car1.company = "Kia";
		car1.model = "K9";
		car1.carInfo();		
		car1.speedUp();
		car1.speedDown();
		
		//다형성의 기초
		//같은 모양의 객체로 전혀다른 결과값을 발현하는 성질
		
		car1 = new HyundaiCarInherit();
		car1.company = "Hyundai";
		car1.carInfo();		
		car1.speedUp();
		car1.speedDown();
	}

}
