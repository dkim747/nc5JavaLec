package chap999_homework_2023_03_29;

import java.util.Scanner;

public class _04_ifStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		//1.	
//		int input1 = sc.nextInt();
//		int input2 = sc.nextInt();
//		
//		if(input1 > input2) {
//			System.out.println(input1);
//		}else if(input1 < input2) {
//			System.out.println(input2);
//		}
		
		//2.
//		int input1 = sc.nextInt();
//				
//		if(input1 > 0) {
//			System.out.println("양수");
//		}else if(input1 < 0) {
//			System.out.println("음수");
//		}else {
//			System.out.println("0입니다.");
//		}
		
		//3.
		
//		System.out.println("프로그래밍 언어를 입력하세요");
//		String str = sc.nextLine();		
//		switch(str) {
//				case "Java" :
//					System.out.println("좋아하는 언어입니다");
//					break;
//				case "Python" :
//					System.out.println("공부중");
//					break;
//				default :
//					System.out.println("다른 언어를 공부해보세요.");
//					break;
//					
//		}
		
		//4.
//		System.out.println("숫자를 입력하세요.");		
//		int input = sc.nextInt();
//		
//		switch(input % 3) {
//			case 0 :
//				System.out.println("3의 배수입니다.");
//				break;
//			default :
//				System.out.println("3의 배수가 아닙니다.");
//				break;
//		}
		
		//5.
//		System.out.println("숫자를 입력하세요.");		
//		int input = sc.nextInt();
//		
//		if(input % 2 == 0 && input != 0) {
//			System.out.println("짝수입니다.");
//		}else if(input % 2 == 1){
//			System.out.println("홀수입니다.");
//		}else {
//			System.out.println("0입니다.");
//		}
		
		//6.
//		System.out.println("정수 5개를 입력하세요.");
//		
//		int[] arr = new int[5];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		for(int i = 0; i < arr.length - 1; i++) {
//			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					int bin = arr[i];
//					arr[i] = arr[j];
//					arr[j] = bin;
//					
//				}
//			}
//			System.out.println(arr[i]);
//		}
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//7.
//		System.out.println("문자열을 입력하세요.");
//		
//		String input = sc.nextLine();
//		
//		if(input.toLowerCase().equals("yes")){
//			System.out.println("예");
//		}else if(input.equals("No")) {
//			System.out.println("아니오");
//		}else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
		//8.
//		int input1 = sc.nextInt();
//		int input2 = sc.nextInt();
//		
//		switch(input1 == input2) {
//		
//		}
		
		//9.

		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();	
		
		int cntEvenNum = 0;
		int cntOddNum = 0;
//		
//		int[] arr = new int[3];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % 2 == 0) {
//				System.out.println("모두 짝수입니다.");
//				cntEvenNum++;
//			}else if(arr[i] % 2 == 1) {
//				System.out.println("모두 홀수입니다.");
//				cntOddNum++;
//			}else{
//				System.out.println("짝수 : " + cntEvenNum + "홀수 : " + cntOddNum);
//			}
//		}
		
		if(input1 % 2 == 0 && input2 % 2 == 0 && input3 % 2 == 0) {
			System.out.println("모두 짝수입니다.");
			cntEvenNum++;
		}else if(input1 % 2 == 1 && input2 % 2 == 1 && input3 % 2 == 1){
			System.out.println("모두 홀수입니다.");
			cntOddNum++;
		}else {
			System.out.println("짝수 : " + cntEvenNum + "홀수 : " + cntOddNum);
		}
		
		
		
		
		
	}

}
