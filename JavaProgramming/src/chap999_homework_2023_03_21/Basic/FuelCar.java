package chap999_homework_2023_03_21.Basic;

public interface FuelCar extends Car{
	void addFuel();
	
	public static void causePollution() {
		System.out.println("환경을 더럽힙니다.");
	}
}
