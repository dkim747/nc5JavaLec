package chap999_homework_2023_03_16;

import java.util.Random;

public class _homeworkBasic02 {

	public static void main(String[] args) {
		
		//1. 0 1 2 3 4              4 1 2 3 0
	//		100 61 68 39 74        74 61 68 39 100
		int[] arr = new int[5];
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(101);
			System.out.println(arr[i]);
		}	
		
		for(int i = 0; i < arr.length; i++) {
			if(i%2==1) {
				System.out.println(arr[i]);				
			}else {
				System.out.println(arr[arr.length-i-1]);
			}
		}
		
	}
}
