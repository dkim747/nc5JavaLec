package chap999_homework_2023_03_29;

import java.util.Scanner;

public class _02_typecasting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1.	
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		String str1 = "";
//		String str2 = "";
//		
//		String strNo1 = str1 + num1;
//		String strNo2 = str2 + num2;
//		
//		int no1 = Integer.parseInt(strNo1);
//		int no2 = Integer.parseInt(strNo2);
//		
//		int sum = no1 + no2;
//		
//		System.out.println(sum);
//      -----------------------------------------		
//		String str1 = sc.nextLine();
//		String str2 = sc.nextLine();
//		
//		int num1 = Integer.parseInt(str1);
//		int num2 = Integer.parseInt(str2);
//		
//		int sum = num1 + num2;
//		
//		System.out.println(sum);
		
		//2.
//		System.out.println("정수 2개를 입력하세요");
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		double aa = a;
//		double bb = b;
//		
//		if(b == 0) {
//			System.out.println("b는 0이 될 수 없습니다.");
//		}else {
//			double result = aa / bb;
//			System.out.println(result);
//		}		
//		
//		//3.
//		double doNum = sc.nextDouble();
//		
//		int intNum = (int)doNum;
//		
//		System.out.println(intNum);
		
		//4.
//		System.out.println("숫자 입력");
//		
//		double input = sc.nextDouble();		
//		
//		double result = input*input;
//		
//		double result = Math.pow(input,2);
//		
//		System.out.println(result);
//		
//		String str = "";
//		
//		System.out.println(str+result);
//		
		//5.
//		int iNum = 10;
//		long lNum = 20;
//		long bin = iNum;
//		iNum = (int)lNum;
//		lNum = bin;
//		System.out.println(lNum);
//		System.out.println(iNum);
		
		//6. charAt에 무조건 0을 써야하는이유?
		// 스트링으로 입력한 후에 차 타입으로 변환 하면 입력한 각각의 스트링의 0번째를 입력하게 됌
		//ex) water cup glass의 스트링이 있다하면 charAt입장에서는 0번째는 water의 w, cup의 c, glass의 g가 되는거임
		//인덱스가 0부터 시작하는게 3개가 동시에 생성
		System.out.println("문자 2개 입력");
//		char[] arr = new char[2];
//		String[] arr = new String[2]; //  a  b  aasdd  vdsd
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.next();
//			char a = arr[i].charAt(0);
//			System.out.println((int)a);
//		}
		
			
		
		
		
	
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}