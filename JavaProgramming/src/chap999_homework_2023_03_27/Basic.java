package chap999_homework_2023_03_27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		
		//1. 
		Scanner sc = new Scanner(System.in);		
		
		ArrayList<Integer> inputNum = new ArrayList<Integer>(5);
		
		System.out.println("입력해5개");
		inputNum.add(new Integer(sc.nextInt()));
		inputNum.add(new Integer(sc.nextInt()));
		inputNum.add(new Integer(sc.nextInt()));
		inputNum.add(new Integer(sc.nextInt()));
		inputNum.add(new Integer(sc.nextInt()));
		
		System.out.println(inputNum);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++) {
			int input = sc.nextInt();
			list1.add(input);
		}
		
		System.out.println(list1);
		
		//2.
		
		List<Integer> list2 = new LinkedList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			int input = sc.nextInt();
			list2.add(input);
		}
		list2.set(3, 100);
		list2.set(4, 200);
		
		System.out.println(list2);
		
		//3.
		Map<String, Integer> alphabet = new HashMap<String, Integer>();
		
		for(int i = 65; i <= 97; i++) {
			alphabet.put(Character.toString(i),i);
		}
		for(int i = 100; i <= 127; i++) {
			alphabet.put(Character.toString(i),i);
		}
		
	}

}
