package chap999_homework_2023_04_04;

import java.util.Scanner;

import chap999_homework_2023_04_04.clazz.PrintNum;

public class PrintArr {

	public static void main(String[] args) {
		action((int[] arr) -> {
			for(int i : arr) {
				if(i % 2 == 0) {
					System.out.println(i);
				}
			}
		});
		
	}
	
	public static void action(PrintNum pn) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
				
				int[] arr = {1, 2,3,4,5};
		//		for(int i = 0; i < arr.length; i++) {
		//			arr[i] = sc.nextInt();
		//			
		//		}
				
				 pn.printEvenNum(arr);
	}


}
