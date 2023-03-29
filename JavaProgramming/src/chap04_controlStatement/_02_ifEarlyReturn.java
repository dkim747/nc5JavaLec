package chap04_controlStatement;

import java.util.Scanner;

public class _02_ifEarlyReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lunchprice = sc.nextInt();
		
		String str = getFeeling(lunchprice);
		
		System.out.println(str);				
	}
	public static String getFeeling(int price) {
		if(price>=10000) {
			return "너무비싸다";			
		}
		
		return getFeeling2(price);
	}
	
	public static String getFeeling2(int price) {
		if(price >= 8000) {
			return "조금 비싸다";			
		}
		return "적정하거나 싼 편이다";
	}

}
