package chap99_etc;

public class _01_printReverse {

	public static void main(String[] args) {
		//fEdCBa를 출력해라!
		
		String str = "AbcDeF";
		
		//대소문자 변환된 문자열을 담는 문자열
		String capStr = "";
				
		
		//대문자 소문자 바꿔주는 작업
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			char capCh = ch >= 'A' && ch <='Z' ?
					(char)((int)ch + 32) : (char)((int)ch - 32);
			
			//capStr = a;
			//capStr = a + B; => aB;
			//capStr = aB + C; => aBC;
			//..
			//capStr = aBCdE + f; => aBCdEf;
			capStr += capCh; //capStr = capStr + capCh;
			
			capStr = capCh + capStr; //이렇게 하면 더 간단하게 할 수 있음
		}
			System.out.println(capStr);
		//반대로 출력
		for(int i = capStr.length() - 1; i >= 0; i--) {
			System.out.print(capStr.charAt(i));
		}
	}

}
