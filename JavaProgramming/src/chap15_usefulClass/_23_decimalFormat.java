package chap15_usefulClass;

import java.text.DecimalFormat;

public class _23_decimalFormat {

	public static void main(String[] args) {
		
		
		//자바에선 많이 안쓰지만 쿼리나 프론트에서 보여줄때 많이 쓴다.
		
		DecimalFormat df = new DecimalFormat("###,###");
		
		int price1 = 100000;
		int price2 = 1000000000;
		
		System.out.println(df.format(price1));
		System.out.println(df.format(price2));
	}

}
