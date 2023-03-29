package chap999_homework;

import java.util.Random;
import java.util.Scanner;

public class _2023_03_15_04_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int com;
		int user;
		com = rand.nextInt(3);
		System.out.println("컴퓨터 : "+com);
		System.out.println("사용자 : 가위:0, 바위:1 보:2");
		user = sc.nextInt();
		
		if(com==user) 
			System.out.println("비김");
		if(com==0&&user==1) 
			System.out.println("승리");
		if(com==0&&user==2)
			System.out.println("패배");
		if(com==1&&user==0)
			System.out.println("패배");
		if(com==1&&user==2)
			System.out.println("승리");
		if(com==2&&user==0)
			System.out.println("승리");
		if(com==2&&user==1)
			System.out.println("패배");
		
		
	}

}
