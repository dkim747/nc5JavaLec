package chap999_homework_2023_03_29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _01_variables {

	public static void main(String[] args) {
		
		//1.
		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		int age = sc.nextInt();
//		String sex = sc.nextLine();
//		
//		System.out.println("이름: " + name + "나이: " + age + "성별: " + sex);
//		
//		//2.
//		System.out.println("숫자2개와 연산자를 입력하세요.");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		sc.nextLine();
//		char ch = sc.nextLine().charAt(0);
//		
//		int c = 0;
//		
//		switch(ch) {
//			case '+' :
//				c = a + b;
//				System.out.println(c);
//				break;
//			
//			case '-' :
//				c = a - b;
//				System.out.println(c);
//				break;
//			
//			case '*' :
//				c = a * b;
//				System.out.println(c);
//				break;
//			
//			case '/' :
//				if(a == 0) {
//					System.out.println("a는 0이 될 수 없습니다.");
//				}else {
//					c = a / b;
//					System.out.println(c);
//					break;
//				}
//			default :
//				System.out.println("잘못된 형식의 숫자입니다.");
//				break;				
//		}
//		
//		
//		//3.
//		final double pi = 3.14;
//		int radius = 20;
//		
//		double area = 2 * pi * (radius^2);
//		double circumference = 4 * pi * radius;
//		
//		System.out.println(area);
//		System.out.println(circumference);
//		
//		//4.
//		int[] arr = new int[5];
//		int sum = 0;
//		int avg = 0;
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			sum += arr[i];
//			avg = sum/arr.length;
//		}
//		System.out.println(sum);		
//		System.out.println(avg);
		
		//5.
		int[] arr2 = new int[3];
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();					
		}		
		
		int min = arr2[0];
		for(int i = 1; i < arr2.length; i++) {
			if(min > arr2[i]) {
				min = arr2[i];
			}
		}
		System.out.println("최소값: " + min);
		
		int max = arr2[0];
		for(int i = 1; i < arr2.length; i++) {
			if(max < arr2[i]) {
				max = arr2[i];
			}
		}
		System.out.println("최대값: " + max);
		
		
		for(int i = 0; i < arr2.length; i++) {
			int med = arr2[i];
			if(med < max && med > min) {
				med = arr2[i];
				System.out.println("중간값: " + med);
			}		
		}
		
		//6.
//		System.out.println("숫자를 입력하세요.");
//		int input = sc.nextInt();
//		
//		for(int i = 1; i < 10; i++) {
//			int result = input * i;
//			System.out.println(input + "*" + i + "=" + result);
//		}
		
		//7. gg
//		System.out.println("숫자를 입력하세요.");
//		int input = sc.nextInt();//5		
//		int result=1;
//		for(int i = input; i > 0; i--) {			
//			result *= i;
//		}
//
//		System.out.println(result);	
		
		
		//8.
		System.out.println("숫자를 입력하세요.");
		
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			if((arr[i] =< 2) && (arr[i] >= 30)) {
				System.out.println("");
			}
			
			
			
			
		}
		
		
		
			
				
	}

}
