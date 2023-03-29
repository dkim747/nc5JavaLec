package chap99_etc;

import java.util.Scanner;

public class _05_inputNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~200사이의 숫자를 입력하세요. : ");
		
		Scanner sc=new Scanner(System.in);
		
		//컴퓨터는 변수에 1~200 랜덤값
		int com;
		com = (int)(Math.random()*200)+1;
		//사용자 입력 정수받기 nextInt
			//201이면 while문 종료
			//com==input
			//맞췄습니다.
			//계속 하시겠습니까?
			//1 => com=새로운 1~200까지의 난수, 다시게임 시작
			//0 => 게임종료
			
			//틀렸습니다. 다시 입력하세요.
			//입력값 다시 받도록
		while(true) {
			int input = sc.nextInt();
			if(input==201) {
				break;			
			}
			if(com==input) {
				System.out.println("맞췄습니다. 계속 하시겠습니까?");
			if(input==1) {
				continue;
			}
			if(input==0) {
				break;			
			}
			
			}			
		}
	}

}
