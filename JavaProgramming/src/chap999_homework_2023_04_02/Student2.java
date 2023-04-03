package chap999_homework_2023_04_02;

public class Student2 {
	private String stnName;
	private String stnId;
	private String major;
	
	public Student2(String stnName, String stnId, String major) {
		super();
		this.stnName = stnName;
		this.stnId = stnId;
		this.major = major;
	}

	public String getStnName() {
		return stnName;
	}

	public String getStnId() {
		return stnId;
	}

	public String getMajor() {
		return major;
	}

	public void setStnName(String stnName) {
		this.stnName = stnName;
	}

	public void setStnId(String stnId) {
		this.stnId = stnId;
	}

	public void setMajor(String major) {
		this.major = major;
	}


	
	
}
