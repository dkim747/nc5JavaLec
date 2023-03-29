package chap99_etc;

public class _03_mathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 난수발생 첫번째 방식
		//Math.random() 사용
		//0 <= Math.random < 1 사이의 난수
		System.out.println(Math.random());
		
		//2. 1<=Math.random()<11
		//0<=Math.random()*10<10
		//1<=(int)Math.random()*10+1<11
		int rand = (int)(Math.random()*10)+1;
		System.out.println(rand);
		
		//3. 1~45까지 난수 발생기
		int randNum = (int)(Math.random()*45)+1;
		System.out.println(randNum);
		
		//4. 200~299까지 난수 발생기
		//0 <= x <1
		//0*100=0 <= x*100 < 1*100=100
		//0+200=200 < (x*100)+200 < 100+200
		
		
		int randNum2 = (int)(Math.random()*100)+200;
		System.out.println(randNum2);
		
		//a~b까지 랜덤
		//(int)(Math.random()*(b-a+1)) + a
		
	}

}
