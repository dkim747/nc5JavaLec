package chap06_class.phone;

import java.util.Scanner;

public class PhoneInfo {
	
	Scanner sc = new Scanner(System.in);
	//이름 100개와 전화번호 100개를 담을수 있는 배열 2개(String)
	String[] name = new String[100];
	String[] phoneNum = new String[100];
	//배열의 현재 인덱스를 담고있을 변수
	int index = 0;
	
	//전달받은 이름과 전화번호를 저장하는 메소드
	//insertPhoneNum	
	
	public void insertPhoneNum(String name, String phoneNum) {
		this.name[index] = name;
		this.phoneNum[index] = phoneNum;
		index++;
	}
	
	//저장된 모든 이름과 전화번호를 출력하는 메소드
	//printAllPhoneNum
	//ex) 이름: 홍길동1, 전화번호: 11111111111
	//	  이름: 홍길동2, 전화번호: 22222222222
	
	public void printAllPhoneNum() {		
		 for(int i=0; i<name.length;i++) { 
			 if(name[i]!= null) {
				 System.out.println("이름: " + name[i] + ", 전화번호: " + phoneNum[i]); 
			 } 
		 }	
	}
	
	//전달받은 번호에 해당하는 이름과 전화번호를 출력하는 메소드
	//printPhoneNum
	//ex) 이름: 홍길동1, 전화번호: 11111111111
	
	//왜 인덱스에 -1을 해줘야하는지
	
	public void printPhoneNum(int index) {
		if(name[index] != null) {
			System.out.println("이름: " + name[index] + ", 전화번호: " + phoneNum[index]);
		}else {
			System.out.println("입력하신 정보가 없습니다.");
		}
	}
	
}
