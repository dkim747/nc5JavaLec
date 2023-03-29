package chap999_homework_2023_03_21.Basic;

public interface Car {
	
	//public static final int speed = 100;
	
	void speedUp();
	void speedDown();
	
	default void protectsDrivers() {
		System.out.println("운전자를 보호합니다.");
	}
}
