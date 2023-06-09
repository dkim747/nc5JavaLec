package chap15_usefulClass;

import java.util.Calendar;

public class _19_differenceOfTwoDate {

	public static void main(String[] args) {
		
		Calendar d1 = Calendar.getInstance();
		Calendar d2 = Calendar.getInstance();
		
		d2.set(2011, 2, 11);
		
		//getTimeInMill() : long타입으로 지정된 날짜를 밀리세컨드로 리턴
		
		long diff = d1.getTimeInMillis() - d2.getTimeInMillis();
		System.out.println("d2부터 d1까지" + (diff / 1000) + "초가 지났습니다.");
		System.out.println("d2부터 d1까지" + (diff / (1000*60)) + "분이 지났습니다.");
		System.out.println("d2부터 d1까지" + (diff / (1000*60*60)) + "시간이 지났습니다.");
		System.out.println("d2부터 d1까지" + (diff / (1000*60*60*24)) + "일이 지났습니다.");
		System.out.println("d2부터 d1까지" + (diff / ((long)1000*60*60*24*30) + "달이 지났습니다."));
		System.out.println("d2부터 d1까지" + (diff / ((long)1000*60*60*24*30*12) + "년이 지났습니다."));
		
		
		Calendar d3 = Calendar.getInstance();
		
		d3.set(2013, 3, 14);
				
		
		long dif = d1.getTimeInMillis() - d3.getTimeInMillis();
		long year = dif / ((long)1000*60*60*24*30*12); // diff % ((long)1000*60*60*24*30*12)
		dif = dif % ((long)1000*60*60*24*30*12);
		long month = dif / ((long)1000*60*60*24*30);
		dif = dif % ((long)1000*60*60*24*30);
		long days = dif /((long)1000*60*60*24);
		dif = diff % ((long)1000*60*60*24);
		long hours = dif /((long)1000*60*60);
		dif = dif % ((long)1000*60);
		long min = dif / ((long)1000*60);
		dif = dif % ((long)1000*60);
		long sec = dif / (long)1000;
		
		
		System.out.println(year+ "년" + month + "달" + days + "일" + hours + "시간" +  min + "분" +  sec + "초"+ "지났는지");
	}

}
