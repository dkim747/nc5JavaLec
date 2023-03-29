package chap06_class;

import chap06_class.animal.Bird;

public class _05_actionOFBirds {

	public static void main(String[] args) {
		Bird bird = new Bird("참새", "모이");
		Bird eagle = new Bird("독수리", "뱀");
		Bird chiken = new Bird("닭", "잡식");
			
		//bird.wing = 2;
		//bird.color = " ";
		//bird.name = "독수리";
		//bird.size = 1;
		//bird.food = "고기";
		
		bird.fly("뭅니다");
		bird.cry();
		bird.eat();
		
		
	}

}
