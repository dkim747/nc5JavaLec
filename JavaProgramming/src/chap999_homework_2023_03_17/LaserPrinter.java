package chap999_homework_2023_03_17;

public class LaserPrinter extends Printer{
	
	public int remainToner;
	
	
	public void print() {
		System.out.println("토너잔량: " + remainToner);
	}
}
