package chap999_homework;

public class _2023_03_14_03_advance {

	public static void main(String[] args) {
		String str = "dBEfIZ";
		String str1 = "";
		char a;
		
		for (int i = 0; i < str.length(); i++) {
			char str2 = str.charAt(i);
			
			if (str2 >= 65 && str2 <= 90) {
				str2+=33;
			
				if(str2>=123) {					
					a = (char)(str2 - 122);
					str2 = (char)(a + 96);
					
				}				
			}else if (str2 >= 97 && str2 <= 122) {
				str2-=33;
			}
		str1 = str2 + str1;
	}
		System.out.println(str1);
		//str1 = "ziFebD"
	}
}
