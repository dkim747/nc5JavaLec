package chap999_homework_2023_04_02;

import java.util.Scanner;

import chap999_homework_2023_04_02_class.No1;

public class _02_class {

	public static void main(String[] args) {

		No1 stn = new No1();
		Scanner sc = new Scanner(System.in);
		boolean isExit = false;

		while (true) {
			System.out.println("숫자로 고르세요.");
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 학생정보 출력");
			System.out.println("3. 종료");
			int input = sc.nextInt();

			switch (input) {
			case 1:
				stn.insertStnInfo();
				break;
			case 2:
				stn.printStnInfo();
				break;
			case 3:
				isExit = true;
				break;
			default:
				break;
			}

			if (isExit) {
				break;
			}
		}
		
		sc.close();

	}

}
