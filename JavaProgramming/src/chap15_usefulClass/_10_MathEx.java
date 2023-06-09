package chap15_usefulClass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		
		/*
		//사용자가 5개 정수 입력 => 배열에 저장
		System.out.println("5개의 정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();			
			arr[i] = num;
			//System.out.println(arr[i]);
			System.out.println(Math.max(arr[0], arr[1]));
		}
		
		
		
		//Math.max와 Math.min을 이용하여 최소값 최대값 구하기
		*/
		
		//사용자가 5개 정수 입력 => 배열에 저장
		Scanner sc = new Scanner(System.in);
		
		int[] numArr = new int[5];
		
		for(int i = 0; i<numArr.length; i++) {
			numArr[i] = sc.nextInt();			
		}
				
		int max = numArr[0];
		int min = numArr[0];
		
		//Math.max와 Math.min을 이용하여 최소값 최대값 구하기
		for(int i = 0; i < numArr.length; i++) {
			max = Math.max(max, numArr[i]);
			min = Math.min(min, numArr[i]);			
		}
		
		System.out.println(max);
		System.out.println(min);
		
		sc.close();
		
	}

}
