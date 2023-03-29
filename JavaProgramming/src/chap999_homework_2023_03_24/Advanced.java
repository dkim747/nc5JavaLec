package chap999_homework_2023_03_24;

import java.util.Calendar;

public class Advanced {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(2001, 12, 19);
		
		int year = cal.get(Calendar.YEAR);
		
		while(true){
			if(isleap()) {
				cal.add(Calendar.DATE, 1);
			}else {
				continue;
			}
			
		}
		
	public static boolean isLeap(int year) {
		if(year % 400 == 0 || year % 100 == 0 && year % 4 ==0) {
			return true;
		}else {
			return false;
		}
	}
		
	
	}

}
