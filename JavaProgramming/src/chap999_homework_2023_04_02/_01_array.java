package chap999_homework_2023_04_02;

import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

public class _01_array {

	public static void main(String[] args) {
		
		//1.
//		int[] arr = new int[10];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i+1;
//			System.out.println(arr[i]);	
//		}
		
		//2.
		Scanner sc = new Scanner(System.in);
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		while(true) {
//			System.out.println("정수를 입력하세요");
//			String input = sc.nextLine();
//			
//			if(input.equals("q")){
//				break;
//			}
//			
//			int num = Integer.parseInt(input);
//			list.add(num);	
//		}
//		System.out.println(list);
		
		//3.
//		int[] arr = new int[10];
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			sum = arr[i]+sum;
//		}
//		System.out.println(sum/arr.length);
		
		//4.
//		int[] arr = new int[50];
//		int sum = 0;
//		int index = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 0) {
//				arr[index] = i;
//				index++;
//				sum = sum+i;
//				
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(sum);
		
		//5.
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		for(int i = 0; i < arr.length - 1; i++) {
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					int bin = arr[j];
//					arr[j] = arr[i];
//					arr[i] = bin;
//				}
//			}
//		}
//		System.out.println(arr[0] + "&&" + arr[9]);
		
		//6.
//		String[] arr = new String[5];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextLine();
//		}
//
//		for (int i = 0; i < arr.length - 1; i++) {
//
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i].length() > arr[j].length()) {
//					String bin = arr[j];
//					arr[j] = arr[i];
//					arr[i] = bin;
//				}
//			}
//		}
//		
//		System.out.println("min : " + arr[0] +" && max : " + arr[4]);
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//7.
		Random rand = new Random();
		
		int[] input1 = new int[4];
		int[] input2 = new int[3];
		
		for(int i = 0; i < input1.length; i++) {
			input1[i] = (rand.nextInt(100))+1;			
		}
		
		for(int i = 0; i < input1.length; i++) {
			input2[i] = (rand.nextInt(100))+1;			
		}
		
		int[] sum = ArrayUtils.addAll(input1, input2);
		
		
	
		
	}

}
