package seog;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];

		int sum = 0; // 총합변수 초기화

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {

			System.out.println("값을 입력하세요");

			arr[i] = sc.nextInt();

			sum += arr[i];

		}

		sc.close();

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]);

		}
		System.out.println();
		System.out.println(sum);
	}

}
