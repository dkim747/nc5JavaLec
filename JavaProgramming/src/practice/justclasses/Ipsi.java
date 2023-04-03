package practice.justclasses;

import java.util.Scanner;

public class Ipsi {
	
	Scanner sc = new Scanner(System.in);
	
	public int stnSeatNo;
	public String stnName;
	public int schedule;
	public int timeArrival;
	
	public void insertStnInfo(int stnSeatNo, String stnName, int schedule) {
		this.stnSeatNo = stnSeatNo;
		this.stnName = stnName;
		this.schedule = schedule;
	}
	
	public void attendance() {
		if(this.timeArrival <= this.schedule) {
			System.out.println("Made in time~");
		}else {
			System.out.println("LATE!!");
		}
	}
	
}
