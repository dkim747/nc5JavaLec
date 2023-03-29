package chap999_homework;

public class _2023_03_15_01_advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money;
		money = 78670; //시용자가 입금한 금액
		
			
		int oman = (money/50000);
		
		int man = ((money-50000)/10000);
		
		int ochun = ((money-((50000*oman)+(10000*man)))/5000);
		
		int chun = ((money-((50000*oman)+(10000*man)+(5000*ochun)))/1000);
		
				
		
	}

}
