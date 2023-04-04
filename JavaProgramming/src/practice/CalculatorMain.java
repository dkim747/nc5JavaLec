package practice;

import java.util.Scanner;

import practice.justclasses.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		
		make((a,b) -> {
			int result = a + b;
			System.out.println(result);			
		});
	}
	
	public static void make(Calculator cal) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		cal.calculate(a, b);
	
	}


}
