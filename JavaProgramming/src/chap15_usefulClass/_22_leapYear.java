package chap15_usefulClass;

import java.util.Scanner;

public class _22_leapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도를 하나 입력하세요.");
		
		int year = sc.nextInt();
		
		if(isLeap(year)) {
			System.out.println(year + "년도는 윤년입니다.");
		}else {
			System.out.println(year + "년도는 윤년이 아닙니다.");
		}
	}
	
	
	public static boolean isLeap(int year) {
		//400으로 나눠 떨어지거나 4로 나눠떨어지고 100으로 나눠 떨어지지 않는것
		return year%400==0 || (year%4==0 && year%100 !=0);	 
	}
}
