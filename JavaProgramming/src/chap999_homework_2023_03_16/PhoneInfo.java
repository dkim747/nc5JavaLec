package chap999_homework_2023_03_16;

import java.util.Scanner;

public class PhoneInfo {
	
	Scanner sc = new Scanner(System.in);
	
	String[]name = new String[100];
	String[]phoneNum = new String[100];
	
	int i = 0;
	
	public void insertPhoneInfo(String name, String number) {		
//			for(int i = 0; i < this.name.length; i++) {
//				this.name[i] =  
//			for(int i = 0; i< this.phoneNum.length; i++) {
//				this.phoneNum[i] = sc.nextLine();
//			}
			this.name[i] = name;
			phoneNum[i] = number;
			i++;
	}
	
	public void printAllPhoneInfo() {
			for(int j = 0; j < name.length; j++) {
				if(name[j] != null) {
					System.out.println("이름: " + name[j] + "번호: " + phoneNum[j]);					
				}
			}
	}
	
	public void printPhoneInfo(int index) {
			if(name[i] != null) {
				System.out.println("이름: " + name[i] + "번호: " + phoneNum[i]);
			}else {
				System.out.println("입력하신 정보가 없습니다.");
			}
	}
	
	
	
}
