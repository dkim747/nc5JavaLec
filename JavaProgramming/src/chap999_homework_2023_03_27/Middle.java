package chap999_homework_2023_03_27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> score = new HashMap<String, Integer>();
		
		for(int i = 0; i < 4; i++) {
			score.put(sc.nextLine(), sc.nextInt());
			sc.nextLine();
		}
		System.out.println(score);
		
		
		for(int i = 0; i < score.size(); i ++) {
			
			
		}
		
		
	}

}
