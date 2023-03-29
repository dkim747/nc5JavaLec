package chap04_controlStatement;

public class _10_duplicatedForBr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//외내부 for문이 몇번 실행 됐는지 담을 변수
		int iCnt=0;
		int jCnt=0;
		for(int i=0; i<5; i++) {
			
			if(i==3) {
				break;				
			}
			iCnt++;
			for(int j=0; j<5; j++) {
				if(j==2) {
					break;					
				}
				jCnt++;
			}
		}
		System.out.println(iCnt);
		System.out.println(jCnt);
	}

}
