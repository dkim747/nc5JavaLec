package chap10_abstraction.academy;

public class EnglishAcademy extends Academy {
	
	//어노테이션 @~~~~
	//@Override: 오버라이드된 메소드라고 컴파일러에게 알림
	//@Override 없으면 컴파일러가 오버라이드된 머소드인지 부모와 자식을 계속 비교하면서 컴파일해야한다.
	
	
	@Override
	public void teach() {
		System.out.println("영어학원에서 영어를 가르친다");	
	}
	
	@Override
	public void doingHomework() {
		System.out.println("영어학원에서 숙제를 합니다.");
	}
	
	@Override
	public void rest() {
		System.out.println("영어학원에서 쉽니다.");
	}		
	
	@Override
	public void attend() {
		System.out.println("영어학원에 출석합니다.");
	}
		
}
