package chap18_enum.enums;

public enum RGB {
	
	//상수명 RED("red", 255, 0, 0), 
	//	   GREEN(
	//		BLUE( 
	RED("red", 255, 0, 0){
		public void makeWhite() {
			String[] color = {"red", "green", "blue"};
			
			int index = 0;
			
			for(String s : color) {
				if(!s.equals(this.getColor())) {
					if(index == 0) {
						System.out.print(s+", ");
					}else {
						System.out.print(s+" ");
					}
					index ++;
					}
				}
			System.out.println("색상이 부족합니다.");
			}
	}, 
	GREEN ("green", 0, 255, 0){
		public void makeWhite() {
			String[] color = {"red", "green", "blue"};
			
			int index = 0;
			
			for(String s : color) {
				if(!s.equals(this.getColor())) {
					if(index == 0) {
						System.out.print(s+", ");
					}else {
						System.out.print(s+" ");
					}
					index ++;
					}
				}
			System.out.println("색상이 부족합니다.");
			}
	}, 
	BLUE("blue", 0, 0, 255){
		public void makeWhite() {
			String[] color = {"red", "green", "blue"};
			
			int index = 0;
			
			for(String s : color) {
				if(!s.equals(this.getColor())) {
					if(index == 0) {
						System.out.print(s+", ");
					}else {
						System.out.print(s+" ");
					}
					index ++;
					}
				}
			System.out.println("색상이 부족합니다.");
			}
	};
	
	private String color;
	private int red;
	private int green;
	private int blue;
	
	RGB(String color, int red, int green, int blue){
		this.color = color;
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public String getColor() {
		return color;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}
	
	public abstract void makeWhite();
	
}
