package chap999_homework_2023_03_21;

import chap999_homework_2023_03_21.Basic.Car;
import chap999_homework_2023_03_21.Basic.FuelCar;
import chap999_homework_2023_03_21.Basic.HybridCar;

public class BasicHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HybridCar car = new HybridCar();
		
		car.speedUp();
		car.speedDown();
		car.charge();
		car.addFuel();
		car.protectsDrivers();
		
		FuelCar.causePollution();
	}

}
