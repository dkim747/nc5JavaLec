package seog;

import java.util.Random;
import java.util.Scanner;


public class NumBaseball {
	// 게임 룰 : 컴퓨터가 3개의 랜덤값을 가지고
	// 사용자가 3개의 숫자를 입력(중복 불가능)
	// 컴퓨터의 3개의 숫자와 사용자의 3개의 숫자를 비교하는데
	// 숫자만 같으면 볼로 판정
	// 숫자위 위치까지 모두 같으면 스트라이크로 판정
	// 몇 스트라이크 몇 볼인지 출력
	// 3스트라이크시 몇 회만에 맞췄는지 출력하고 게임종료
	// 다시 게임 진행할 지 물어보고(1이면 진행, 0이면 종료)

	// 스트라이크와 볼의 개수를 세어줄 변수
	private int strike = 0;
	private int ball = 0;

	// 몇 번만에 맞췄는지 세어줄 변수
	private int gameCnt = 0;

	// 컴퓨터 랜덤값 담아줄 배열
	int[] com = new int[3];

	// 사용자 입력값 저장할 배열
	int[] user = new int[3];

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	// 게임시작 메소드
	public void start() {
		while (true) {
			generateRandom();

			// 컴퓨터 배열 확인
			System.out.println(com[0] + ", " + com[1] + ", " + com[2] + " 컴퓨터");

			while (true) {
				strike = 0;
				ball = 0;
				gameCnt++;

				getUserInput();
				// 사용자 입력값 확인
				System.out.println(user[0] + ", " + user[1] + ", " + user[2] + " 유저");

				if (judgetStrike()) {
					break;
				} else
					System.out.println(strike + "스트라이크 " + ball + "볼");
				continue;

			}
			if (reGame()) {
				continue;
			} else
				break;
		}
	}

	// 컴퓨터 랜덤 값 3개 생성해주는 메소드
	public void generateRandom() {
		int num = 1;
		for (int i = 0; i < 3; i++) {
			com[i] = rand.nextInt(9) + 1;
			// 중복 체크 로직
			checkDuplicate(com, 2);
		}
	}

	// 중복 값 체크해주는 함수
	public boolean checkDuplicate(int[] arr, int num) {
		boolean isDuplicated = false;
		for (int i = 0; i < num; i++) {
			if (arr[i] == arr[i + 1]) {
				arr[i] = rand.nextInt(9) + 1;
			}		
		}
		return false;
	}

	// 유저의 입력값을 받아서 배열에 담아주는 메소드
	public void getUserInput() {
		for (int i = 0; i < 3; i++) {
			user[i] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				if (user[j] == user[i]) {
					System.out.println("중복된 값을 입력했습니다.");
					i--;
					break;
				}
			}
		}
		gameCnt++;
	}

	// 스트라이크 볼 판정하는 메소드
	public boolean judgetStrike() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (com[i] == user[j] && i == j) {
					strike++;
				} else if (com[i] == user[j] && i != j) {
					ball++;
				}
			}
		}
		/*
		for (int i = 0; i < 3; i++) {
			if (com[i] == user[i]) {
				strike++;
			}
		}
		if (com[0] == user[1] || com[0] == user[2])
			ball++;
		else if (com[1] == user[0] || com[1] == user[2])
			ball++;
		else if (com[2] == user[1] || com[2] == user[0])
			ball++;*/

		if (strike == 3) {
			return true;
		}
		return false;
	}

	// 재게임 여부
	public boolean reGame() {
		System.out.println(gameCnt + "번만에 맞추셨습니다.");
		System.out.println("(1.재시작   0.종료)");
		int choice = sc.nextInt();
		if (choice == 1) {
			return true;
		}
		return false;
	}
}

