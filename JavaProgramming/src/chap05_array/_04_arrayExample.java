package chap05_array;

import java.util.Random;
import java.util.Scanner;

public class _04_arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		//해당 판의 승무패를 담아줄 배열(w, d, l)
		char[] wdlArr=new char[10];
		
		
		for(int i=0;i<10;i++) {
			int com = rd.nextInt(3);		
		//가위바위보 10판진행해서 배열에 각 판의 승무패 저장
		//배열에 저장된 승,무,패를 세서 몇승 몇무 몇패인지 출력		
		System.out.print("가위, 바위, 보 중 하나를 입력하세요. : ");
		String input = sc.nextLine();
		int inputNum = 0;
		
		if(input.equals("가위")) {
			inputNum = 0;
		} else if(input.equals("바위")) {
			inputNum = 1;
		} else if(input.equals("보")) {
			inputNum = 2;
		}
		
		if(com == inputNum) {
			wdlArr[i]=(char)('d');
			System.out.println("비겼습니다.");
		} else {
			if((inputNum == 0 && com == 2) ||
				(inputNum == 1 && com == 0) ||
				(inputNum == 2 && com == 1)) {
				wdlArr[i]=(char)('w');
				System.out.println("이겼습니다.");
				
			} else {
				wdlArr[i]=(char)('l');
				System.out.println("졌습니다.");
			}
		}
		
	
		}
		int winCnt=0;
		int drawCnt=0;
		int loseCnt=0;
		
		for(int i=0;i<wdlArr.length;i++) {
			if(wdlArr[i]=='w') {
				winCnt++;				
			}else if(wdlArr[i]=='d') {
				drawCnt++;
			}else if(wdlArr[i]=='l') {
				loseCnt++;
			}
		}
		System.out.println(winCnt+"승"+drawCnt+"무"+loseCnt+"패");
		
		sc.close();
		
		//몇승 몇무 몇패 출력
	}

}
