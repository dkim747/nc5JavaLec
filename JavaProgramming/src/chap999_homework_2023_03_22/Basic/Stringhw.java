package chap999_homework_2023_03_22.Basic;

import java.util.Scanner;

public class Stringhw {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1.
		
		System.out.println("문자를 입력하세요.");
		String str1 = sc.nextLine();
		int mid = str1.length()/2;
		
		if(str1.length()%2 == 0) {
			System.out.println(str1.substring(mid-1, mid+1));
		}else{
			System.out.println(str1.charAt(mid));
		}
		
		
		//2.
		
		System.out.println("문자를 입력하세요.");
		String str2 = sc.nextLine();
		
		if(str2.contains("가바")) {
			System.out.println();
		}
		
		
		//3.
		
		System.out.println("문자를 입력하세요.");
		String str3 = sc.nextLine();
		
		String str4 = str3.toLowerCase();
		String str5 = str3.toUpperCase();
		
		if(str4.contains("a")||str4.contains("e")||str4.contains("i")||str4.contains("o")||str4.contains("u")) {
			System.out.println(str4.replace("a","").replace("e","").replace("i","").replace("o","").replace("u",""));
		}if(str5.contains("A")||str5.contains("E")||str5.contains("I")||str5.contains("O")||str5.contains("U")) {
			System.out.println(str5.replace("A","").replace("E","").replace("I","").replace("O","").replace("U",""));
		}
		
		
		//4.
		System.out.println("문자를 입력하세요.");
		String str6 = sc.nextLine();
		
		//if(str6.equals(str6))
		
		
		
	}
}
