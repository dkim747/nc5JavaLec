package chap999_homework_2023_04_02_class;

import java.util.ArrayList;
import java.util.Scanner;

import chap999_homework_2023_04_02.Student2;

public class UseOfStudent2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Student2> arraylist = new ArrayList<Student2>();
		
		System.out.println("학생 정보 입력. 그만하려면 quit을 치셈");
		
		while(true) {
			System.out.println("이름");
			String stnName = sc.nextLine();
			if(stnName.equals("quit")) {
				break;
			}
			
			System.out.println("학번");
			String stnId = sc.nextLine();
			
			System.out.println("전공");
			String major = sc.nextLine();
			
			Student2 student2 = new Student2(stnName, stnId, major);
			arraylist.add(student2);			
		}
		
		
		
		
	
		
		
	}

}
