package chap999_homework_2023_03_16;

import java.util.Scanner;

public class _homeworkBasic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		/*
		//1.
		int[] arr = new int[10];
		int num = 1;
		int count = 0;
		
		while(true){
			if(num % 3 == 0) {
				arr[count++]=num;				
			}num++;
			if(count == 10) {
				break;
			}
		}for(int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);	
		}
		*/
		
		/*
		//2.		
		int[] arr2 = new int[10];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print("숫자 10개 입력");
			arr2[i] = sc.nextInt();
			
		}
		for(int j : arr2) {
			sum+=j;
			System.out.println(j);
		}
		System.out.println(sum);
		
		sc.close();
		*/
		
		/*
		//3.
		int arr[] = new int[10];
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (rand.nextInt(10))+1;
		}
		for(int o : arr) {
			if(o % 2 ==1) {
				System.out.println(o);
			}
		}
		*/
		
		//4.
		int[] arr = new int[10]; 
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int j : arr) {
			if(j % 2 == 0 || j % 3 == 0) {
				System.out.println(j);
			}
		}
		
	
	}	

}
