package chap13_objectarray.clazz;

public class Programming implements ILecture{
	
	private String subject;
	private int studentCnt;
	private int lectureTime;
	
	public Programming(String subject, int studentCnt, int lectureTime) {
		this.subject = subject;
		this.studentCnt = studentCnt;
		this.lectureTime = lectureTime;
	}
	
	@Override
	public void proceedLecture() {
		// TODO Auto-generated method stub
		System.out.println(this.subject + "수업을 " + this.studentCnt + "명의 학생이 듣습니다. 수업시간은 " + this.lectureTime + "분 입니다.");
	}

	
}
