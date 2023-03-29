package chap05_array;

public class _02_arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[10];
		
		//1씩 증가하면서 3의 배수인지 검사될 변수
		//3의 배수이면 nums배열에 저장
		int num = 0;
		
		//3의 배수를 nums에 저장할때마다 1씩 증가할 배열의 인덱스
		int index = 0;
		
		while(index<10) {
			//1부터 3의 배수인지 검사
			num++;
			
			if(num%3==0) {
				//index는 num이 3의 배수일때만 1씩 증가				
				nums[index++]=num;
				//System.out.println(nums[index-1]);
			}
			
		}
		
		
	}
}


