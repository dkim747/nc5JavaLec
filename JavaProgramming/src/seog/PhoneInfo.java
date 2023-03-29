package seog;

public class PhoneInfo {
	String[] name = new String[3];
	String[] phoneNum = new String[3];

	int i = 0;

	public void insertPhoneInfo(String name, String number) {
	//이름과 번호를 배열에 저장
		this.name[i] = name;
		this.phoneNum[i] = number;
		i++;
   }
   //모든 PhoneInfo 출력
   public void printAllPhoneInfo() {
	   for(int i=0; i<3; i++) {
		   System.out.println(name[i]);
		   System.out.println(phoneNum[i]);
		
	   }
   }
   //번호에 해당하는 이름과 번호 출력
    public void printPhoneInfo(int index) {
    	System.out.println("이름: " + name[index-1] + "전화번호: " + phoneNum[index-1]);
    }
}
