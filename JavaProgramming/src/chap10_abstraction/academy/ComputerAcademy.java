package chap10_abstraction.academy;

public class ComputerAcademy extends Academy{
	
	@Override
	public void teach() {
		System.out.println("컴퓨터학원에서 컴퓨터를 가르친다");	
	}
	
	@Override
	public void doingHomework() {
		System.out.println("컴퓨터학원에서 숙제를 합니다.");
	}
	
	@Override
	public void rest() {
		System.out.println("컴퓨터학원에서 쉽니다.");
	}		
	
	@Override
	public void attend() {
		System.out.println("컴퓨터학원에 출석합니다.");
	}
}
