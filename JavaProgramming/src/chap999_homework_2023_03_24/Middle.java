package chap999_homework_2023_03_24;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		
		a = sdf.format(calendar);
		
		//System.out.println(a.get(Calendar.));
		//System.out.println(sdf.format(today));
		//System.out.println(a);
		
		System.out.println("날짜입력");
		a = sc.nextLine();
		//System.out.println(a);
		
		
		
	}

}
