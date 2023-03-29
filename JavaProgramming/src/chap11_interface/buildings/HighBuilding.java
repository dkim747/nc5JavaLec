package chap11_interface.buildings;

//클래스ㅏ 인터페이스를 상속받을떄는 implements 키워드를 사용한다.
//인터페이스를 상속받아 추상메소드중 일부만 구현하려면 추상클래스로 선언한다.
public /*abstract*/ class HighBuilding implements Building {

	@Override
	public void build() {
		// TODO Auto-generated method stub
		System.out.println("고층 건물을 짓는다.");
	}

	@Override
	public void turnOnAircon() {
		// TODO Auto-generated method stub
		System.out.println("에어컨을 가동한다.");
	}

	@Override
	public int getParkingPrice(int time) {
		int totalPrice = time * 1000;
		return totalPrice;
	}

}
