package chap999_homework_2023_03_15;

import java.util.Scanner;

public class Advanced {

	public static void main(String[] args) {
		
		//1.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("돈을 입금하세요!");
		int money = sc.nextInt();
		int count;
		
		int a = money / 50000;
		money = money % 50000;
		int b = money / 10000;
		money = money % 10000;
		int c = money / 5000;
		money = money % 5000;
		int d = money / 1000;
		money = money % 1000;
		int e = money / 500;
		money = money % 500;
		int f = money / 100;
		money = money % 100;
		int g = money / 50;
		money = money % 50;
		int h = money / 10;
		
		System.out.println("5만원: " + a + "1만원: " + b + "5천원: " + c + 
							"1천원: " + d + "500원: " + e + "100원: " + f +
							"50원: " + g + "10원: " + h);
		
		
		//2.
		System.out.println("1~99까지 정수를 입력하세요!");
		int input = sc.nextInt();
		
			int tens = input / 10;
			int ones = input % 10;
			int count2 = 0;
			
			if(tens % 3 == 0 || ones % 3 ==0) {
				count2++;
			}if(tens % 3 == 0 && ones % 3 ==0) {
				count2++;
			}
			if(count2 == 1) {
				System.out.println("박수 짝");
			}else if(count2 == 2) {
				System.out.println("박수 짝짝");
			}else {
				System.out.println("가만히");
			}
			
		//3. AB + BA = 99 를 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하세요.
		//(10*A + B) + (10*B + A) = 99
		for(int aa = 0; aa >= 0 && aa <= 9; aa++){
			for(int bb = 0; bb >= 0 && bb <= 9; bb++){
				if((10*aa + bb)+(10*bb + aa)==99) {
					System.out.println("A: " + aa + ", " + "B: " + bb);
					
				}	
			}
		}		
		
			
	}

}
