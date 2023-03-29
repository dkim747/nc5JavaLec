package chap18_enum;

import chap18_enum.enums.Calculator;

public class _06_abstracMethodEnum {

	public static void main(String[] args) {
		
		Calculator add = Calculator.PLUS;
		int result = add.calculate(10, 5);
		System.out.println(result);
		
		Calculator[] cArr = Calculator.values();
		for(Calculator c : cArr) {
			System.out.println(c.calculate(10, 4));
		}
		
	}

}
