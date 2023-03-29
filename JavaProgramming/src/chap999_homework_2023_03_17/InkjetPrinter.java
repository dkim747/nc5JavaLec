package chap999_homework_2023_03_17;

public class InkjetPrinter extends Printer{

	public int remainInk;
	
	public void print() {
		System.out.println("잉크 잔량: " + remainInk);
	}
	
}
