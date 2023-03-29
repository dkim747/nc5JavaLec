package chap999_homework;

import java.util.Random;
import java.util.Scanner;

public class Pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int number;
		
		System.out.println("1번을 눌러 숫자를 생성하세요");
		int a=sc.nextInt();
		
		for (int i=0; i<6;i++) {
		if (a==1) {
			number =rand.nextInt(45);			
			System.out.println(number);
			}
		}
		
		
	}

}
