package chap999_homework_2023_03_16;

import java.util.Scanner;

public class _homeworkBasic04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i:arr) {
			if(i%2==0 || i%3==0) {
				System.out.println(i);
			}
		}
		
		
	}

}
