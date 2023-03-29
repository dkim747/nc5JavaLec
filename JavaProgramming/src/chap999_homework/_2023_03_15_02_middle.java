package chap999_homework;

public class _2023_03_15_02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=1000; i++) {
			if(i%2==0 && i%7==0) {
				System.out.println(i);
				
				sum=sum+i;
				
			}
			
		}
		System.out.println(sum);
	}
}
