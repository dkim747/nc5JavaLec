package chap20_lambda;

import chap20_lambda.clazz.Converter;
import chap20_lambda.clazz.MoneyConverter;

public class _05_referenceMethod {

	public static void main(String[] args) {

		//static 메소드는 클래스 원형에서 바로 참조
		action(MoneyConverter :: convert);
		
		//일반 메소드는 객체 생성후 참조
		MoneyConverter mcv = new MoneyConverter();
		
		action(mcv :: instanceConvert);
	}
	
	public static void action(Converter con) {
		int result = con.conv(1000000, '$');
		System.out.println("변환된 돈 : $" + result);
	}

}
