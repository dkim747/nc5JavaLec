package chap999_homework_2023_04_02_class;

import java.util.Scanner;

public class No1 {

	Scanner sc = new Scanner(System.in);

	public String[] stnName = new String[100];
	public int[] stnNum = new int[100];
	public String[] major = new String[100];

	int index = 0;

	public No1() {

	}

	public void insertStnInfo() {
		Scanner sc = new Scanner(System.in);

		System.out.println("학생 정보를 입력하세요. 이름 학번 전공");
		this.stnName[index] = sc.nextLine();
		this.stnNum[index] = sc.nextInt();
		sc.nextLine();
		this.major[index] = sc.nextLine();
		index++;
	}

	public void printStnInfo() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.stnName[i] + this.stnNum[i] + this.major[i]);
		}

	}

	public void printIndexInfo() {
		int input = sc.nextInt();
		if (stnName[index] != null) {
			System.out.println("해당 정보는 비어있습니다.");
		} else {

		}
	}

}
