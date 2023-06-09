package chap15_usefulClass;

public class _01_object {
	
	public static class Example implements Cloneable{
		
		//clone 메소드는 Cloneable 인터ㅠㅔ이스를 상속받아 clone()를 직접 구현해야 사용가능하다.
		public Object clone() {
			Object obj = null;
			try {
				obj = super.clone();
			}catch(CloneNotSupportedException ce){
				System.out.println(ce.getMessage());
			}
			return obj;
		}
		
	}	
	
	public static void main(String[] args) {
		
		Example ex1 = new Example();
		Example ex2 = (Example)ex1.clone();
		
		if(ex1.equals(ex2)) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
		
		//객체의 얕은 복사
		ex2 = ex1;
		
		if(ex1.equals(ex2)) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
	}
	

}
