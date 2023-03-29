package chap999_homework_2023_03_21.Basic;

public class HybridCar implements ElectronicCar, FuelCar{

	@Override
	public void speedUp() {		
		System.out.println("속도를 높입니다.");
	}

	@Override
	public void speedDown() {		
		System.out.println("속도를 줄입니다.");
	}

	@Override
	public void addFuel() {		
		System.out.println("연료를 넣습니다.");
	}

	@Override
	public void charge() {		
		System.out.println("전기를 충전합니다.");
	}

}
