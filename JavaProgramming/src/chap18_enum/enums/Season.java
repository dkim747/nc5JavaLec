package chap18_enum.enums;

public enum Season {
	SPRING("봄"){
		public void printSeasonMonth() {
			System.out.println(this.getKoreaSeason() + "은 3, 4, 5월 입니다.");
		}
	},
	SUMMER("여름"){
		public void printSeasonMonth() {
			System.out.println(this.getKoreaSeason() + "은 6, 7, 8월 입니다.");
		}
	},
	FALL("가을"){
		public void printSeasonMonth() {
			System.out.println(this.getKoreaSeason() + "은 9, 10, 11월 입니다.");
		}
	},
	WINTER("겨울"){
		public void printSeasonMonth() {
			System.out.println(this.getKoreaSeason() + "은 12, 1, 2월 입니다.");
		}
	};
	
	private String koreaSeason;
	
	Season(String koreaSeason){
		this.koreaSeason = koreaSeason;
	}

	public String getKoreaSeason() {
		return koreaSeason;
	}
	
	public abstract void printSeasonMonth();		
}