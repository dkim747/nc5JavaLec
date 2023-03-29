package chap999_homework_2023_03_17;

import java.util.Scanner;

public class Printer {
	
	Scanner sc = new Scanner(System.in);
	
	public String nameOfModel;
	public String company;
	public String typeOfInterface;
	public int printNum;
	public int leftovers;
	
	public void nameOfModel() {
		System.out.println("모델명을 입력하세요.");		
		nameOfModel = sc.nextLine();		
	}
	
	public void company() {
		System.out.println("회사명을 입력하세요.");
		company = sc.nextLine();
	}
	
	public void typeOfInterface() {
		
		System.out.println("숫자를 입력하세요:"+ "1: USB" + "2: Pareller port");
		int a = sc.nextInt();
		if (a==1) {
			typeOfInterface = "USB";
		}else if(a==2) {
			typeOfInterface = "Pareller port";
		}		
	}
	
	public void printNum() {
		System.out.println("몇 부를 인쇄하시겠습니까?");
		printNum = sc.nextInt();
		leftovers = printNum -1;		
	}
	
	public void print() {
		
		System.out.println("프린터의 정보입니다.");
		System.out.println("모델명: " + nameOfModel);
		System.out.println("제조사: " + company);
		System.out.println("인터페이스: " + typeOfInterface);
		System.out.println("인쇄매수: " + printNum);
		System.out.println("인쇄종이 잔량: " + leftovers);
		
		
		
		
	}
}
