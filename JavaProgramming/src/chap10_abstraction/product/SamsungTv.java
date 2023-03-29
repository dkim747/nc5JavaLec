package chap10_abstraction.product;

public class SamsungTv extends Tv{
	public void powerOn() {
		System.out.println("samsumgTv 전원켜기");
		
	}
	
	public void powerOff() {
		System.out.println("samsumgTv 전원끄기");
		
	}
	
	public void operate(int channel) {
		System.out.println("samsumTv 채널" + channel + "로 이동");
		super.lastChannel = channel;
	}
}
