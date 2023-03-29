package chap04_controlStatement;

public class _09_duplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삼각형 별 찍기
		/*
        *
        **
        ***
        ****
        *****
        */
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i>=j) {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		/*  i 0              *1111     
		 *  j 0
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		
		
		
		
		
		
		/*
	        *
	       **
	      ***
	     ****
	    *****
	    */
		
		for (int i=0; i<5;i++) {
			for(int j=4; j<=0; j--) {
				if(i>=j) {
					System.out.println("*");
				}else {
					System.out.println(" ");
				}
			}
			System.out.println();
		}		
		/*
		for(int i=0; i<5; i++) {
			for(int j=4; j>=0; j--) {
				if(i >= j) {
				System.out.print("*");
				}
			}
			System.out.println();
			
		} */
		
		/*
		*****
		****
		***
		**
		*
		*/
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i<=j) {
					System.out.print("*");
				}				
			}
			System.out.println();

		}
	}
}
