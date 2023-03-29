package chap15_usefulClass;

import java.util.Scanner;

public class _05_String04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String str = "가비트나네이버다라마바클라우드";
		String str2;
		String str3;
		String str4;
				
		System.out.println(str.replace("비트", " ").replace("네이버", " ").replace("클라우드", " "));
		
		str = str.replace("비트", " ").replace("네이버", " ").replace("클라우드", " ");		
		System.out.println(str.substring(0, 1));
		str2 = str.substring(0, 1);
		
		str3 = str.substring(2, 3);
		System.out.println(str3);
		
		str4 = str.substring(4,9);
		System.out.println(str4);
		
		System.out.println(str2+str3+str4);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(str.replace("비트", " ").replace("네이버", " ").replace("클라우드", " "));
		
		sc.close();
	}

}
