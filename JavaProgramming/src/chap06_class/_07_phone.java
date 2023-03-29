package chap06_class;

import java.util.Scanner;

import chap06_class.phone.PhoneInfo;

public class _07_phone {

	public static void main(String[] args) {
		
		PhoneInfo phoneInfo = new PhoneInfo();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String name;
		String number;
		int i=1, a=2;
		

		while(i<a) {
			System.out.println("조회하고 싶은 번호를 입력하세요.");
			System.out.println("1. 정보 입력");	
			System.out.println("2. 정보 출력");	
			System.out.println("3. 정보 검색");	
			System.out.println("4. 종료");			
			
			choice = sc.nextInt();		
			
			switch(choice) {
				case 1 :
					System.out.println("정보를 입력하세요");		
					name = sc.next();		
					number = sc.next();
					phoneInfo.insertPhoneNum(name, number);
					break;
				case 2 :
					System.out.println("모든 정보출력");
					phoneInfo.printAllPhoneNum();
					break;
				case 3 :
					System.out.println("번호를 입력하셈");
					choice = sc.nextInt();	
					phoneInfo.printPhoneNum(choice);
					break;
				case 4 :
					System.out.println("사용종료");
					i=2;
					break;
				default :
					System.out.println("1~4사이의 값을 입력하세요");
					break;
			}
			
		}

		//phoneInfo.printAllPhoneNum();
		//phoneInfo.printPhoneNum(0);
	}

}
