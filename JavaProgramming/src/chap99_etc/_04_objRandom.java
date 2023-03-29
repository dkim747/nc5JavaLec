package chap99_etc;

import java.util.Random;


public class _04_objRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. 핸덤 정수 생성하는 두 번쨰 방법
		//Random 객체 이용
		Random rand = new Random();
		
		
		
		
		//0~9
		System.out.println(rand.nextInt(10));
		//1~10
		System.out.println((rand.nextInt(10))+1);
		//1~45
		System.out.println((rand.nextInt(45))+1);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
