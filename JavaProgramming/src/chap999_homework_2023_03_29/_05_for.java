package chap999_homework_2023_03_29;

import java.util.Scanner;

public class _05_for {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		//1.
//		int sum = 0;
//		for(int i = 1; i <= 10; i++) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
		
		//2.
//		int num = 2;
//		for(int i = 2; i <= 10; i++) {
//			System.out.print("2");
//			for(int j = 2; j <= i; j++) {
//				System.out.print("*2");
//				num *= 2;
//			}
//			System.out.println("=" + num);
//			num = 2;
//		}
		
		//3.
//		int input = sc.nextInt();
//
//		for (int i = 2; i <= input; i++) {
//			int cnt = 0;
//			for (int j = 2; j <= i; j++) {
//				if (i % j == 0 && i != j) {
//					cnt++;
//				}
//			}
//			if (cnt == 0) {
//				System.out.println(i);
//			}
//		}
		
		//4.
//		int input = sc.nextInt();
//		
//		for(int i = 1; i <= input; i++) {
//			if(input % i == 0) {
//				System.out.println(i);
//			}
//		}
		
		//5.
//		int[] arr = new int[10];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		for(int i = arr.length -1; i >= 0; i--) {
//			System.out.println(arr[i]);
//		}
		
		//6.
//		String input = sc.nextLine();
//		
//		for(int i = input.length()-1; i >= 0; i--) {
//			System.out.print(input.charAt(i));
//		}
		
		//7.
//		int input1 = sc.nextInt();
//		int input2 = sc.nextInt();
//		
//		int gdc = 1;
//		int min = input1 > input2 ? input1 : input2;
//		
//		for(int i = 1; i <= min; i ++) {
//			for (int j = 1; j <= i; j++) {
//				if(input1 % i == 0 && input2 % i == 0) {
//					gdc = i;
//				}
//			}
//		}
//		System.out.println(gdc);
//		System.out.println("lcm = " + input1*input2/gdc);
		
		//8.
//		for(int i = 1; i <= 5; i++) {			
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//				System.out.println();
//		}
		
//		for (int i = 1; i <= 5; i++) {
//		    for (int j = 1; j < i; j++) {
//		        System.out.print(" ");
//		    }
//		    for (int k = 5; k >= i; k--) {
//		        System.out.print("*");
//		    }
//		    System.out.println();
//		}
//		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <=i; j++) {
//				System.out.print(" ");
//			}
//			for(int k = 5; k >= i; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//9.
		
		
		int sum = 0;
		while(true) {
			System.out.println("정수를 입력하세요");
			String input = sc.nextLine();
			
			int num = Integer.parseInt(input);
			sum = sum + num;
			if(input.equals("q")) {
				break;				
			}
		}
		
//		int sum = 0;
//        while (true) {
//            System.out.print("정수를 입력하세요: ");
//            String input = sc.next();
//
//            if (input.equals("q")) {
//                break;
//            }
//
//            try {
//                int num = Integer.parseInt(input);
//                sum += num;
//            } catch (NumberFormatException e) {
//                System.out.println("올바른 정수를 입력하세요.");
//            }
//        }
//
//        System.out.println("입력한 정수의 합: " + sum);
//        sc.close();
//		
	}

}
