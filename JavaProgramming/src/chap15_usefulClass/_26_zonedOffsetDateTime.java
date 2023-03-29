package chap15_usefulClass;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _26_zonedOffsetDateTime {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		
		//ZonId 객체 생성
		ZoneId zid = ZoneId.of("Asia/Seoul");//괄호안에 띄어쓰기 하지 말기
		
		//LocalDateTime에 ZoneId추가해서 ZonedDateTime 객체 생성		
		ZonedDateTime zdt1 = ldt.atZone(zid);
		
		ZonedDateTime zdt2 = ZonedDateTime.now();
		
		//ZonedDateTime 객체에 ZoneId추가
		ZonedDateTime zdt3 = ZonedDateTime.now().withZoneSameInstant(zid);
		
		//ZonedDateTime -> OffsetDateTime
		OffsetDateTime odt = zdt1.toOffsetDateTime();
		
		System.out.println(zdt1);
		System.out.println(zdt2);
		System.out.println(zdt3);
		System.out.println(odt);
		
	}

}
