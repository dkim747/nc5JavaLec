package chap999_homework_2023_03_16;

import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		
		PhoneInfo pi = new PhoneInfo();
		
		boolean flag = false;
		
		while(true) {
			System.out.println("번호를 선택하세요.");
			System.out.println("1. 이름과 번호 입력");
			System.out.println("2. 이름과 번호 전체출력");
			System.out.println("3. 원하는 정보 출력");
			System.out.println("4. 종료");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.print("이름을 입력하세요: ");
					String name = sc.next();
					System.out.print("번호를 입력하세요");
					String phoneNum = sc.nextLine();					
					pi.insertPhoneInfo(name, phoneNum);
					break;
				case 2:
					pi.printAllPhoneInfo();
					break;
				case 3:
					while(true) {
						System.out.println("번호를 입력하세요.");
						int index = sc.nextInt();
						if(index<0 && index >100) {
							System.out.println("잘못 입력하셨습니다.");
						}else {
							pi.printPhoneInfo(index);
							break;
						}
						
					}
					break;
				case 4:
					flag = true;
					break;			
			}
			if(flag = false) {
				break;
			}			
		}		
	}
}
