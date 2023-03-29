package seog;

import java.util.Random;

public class _homework_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int[] num = new int[20];
		int[] num2 = new int[10];
		int index = 0;
		for(int i=0; i<num.length; i++) {
			Random rand = new Random();
			num[i] =i;//rand.nextInt(101);
			if(i%2!=0) System.out.print(num[i] + " ");
			else {
				num2[index] = num[i];
				index++;
				if(index==num2.length-1) {
					for(int j : num2)
					System.out.print(j+ " ");
				}
			}
		}
		// 1 3 5 7 9 11 13 .. 19 20 18 16 14 ... 2*/
		
		
		PhoneInfo phoneInfo = new PhoneInfo();
		
		phoneInfo.insertPhoneInfo("aa", "11");
		phoneInfo.insertPhoneInfo("bb", "22");
		phoneInfo.insertPhoneInfo("cc", "33");
		phoneInfo.printAllPhoneInfo();
		phoneInfo.printPhoneInfo(2);
	}

}
