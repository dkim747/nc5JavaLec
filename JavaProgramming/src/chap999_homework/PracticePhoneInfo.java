package chap999_homework;

import java.util.Scanner;

public class PracticePhoneInfo {

	public static void main(String[] args) {
		PracticePhone phoneInfo = new PracticePhone();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("----연락처----");
			System.out.println("1. 정보입력");
			System.out.println("2. 모든정보출력");
			System.out.println("3. 인덱스로 정보검색");
			System.out.println("4. 종료");
			
			int userInput = sc.nextInt();
			
			switch(userInput) {
				case 1: 
					System.out.println("이름을 입력하세요.: ");
					String name = sc.next();
					sc.nextLine();
					System.out.println("번호를 입력하세요.: ");
					String phoneNum = sc.nextLine();
					
					phoneInfo.insertPhoneNum(name, phoneNum);
					break;
				
				case 2:
					phoneInfo.printAllPhoneNum();
					break;
					
				case 3:
					while(true) {
						System.out.println("조회하고 싶은 번호를 입력하세요.(1~100)");
						int i = sc.nextInt();
						
						if(i<1 || i>100) {
							System.out.println("1~100 안의 숫자를 입력하세요.");
							continue;							
						}else {
							phoneInfo.printPhoneNum(i);
							break;
						}
					}
					break;
				case 4:
					
			}
		}
	}

}

