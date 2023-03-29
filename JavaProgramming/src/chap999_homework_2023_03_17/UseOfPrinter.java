package chap999_homework_2023_03_17;

public class UseOfPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		LaserPrinter laserPrinter = new LaserPrinter();
		InkjetPrinter inkjetPrinter = new InkjetPrinter();
		
		printer.nameOfModel();
		printer.company();
		printer.typeOfInterface();
		printer.printNum();		
		printer.print();
		
		
	}
		

}
