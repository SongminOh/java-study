package 상속;

public class Mouse_main {

	public static void main(String[] args) {

		//자바 상속의 3가지 특징
		
		//1. 다중상속을 지원하지 않는다 ---> 하나의 슈퍼클래스 존재
		//2. 상속의 횟수는 제한되지 않습니다. --> 여러개의 서브클래스 혹은 상속받은 클래스를 상속 받는 것도 가능
		//3. 모든 클래스는 최상위 클래스인 Object를 상속받고 있다.
		
		Mouse m = new Mouse();
		m.click();
		m.rightClick();
		
		System.out.println("============================================");
		
		WheelMouse wm = new WheelMouse();
		wm.click();
		wm.rightClick();
		wm.wheel();
		
		System.out.println("============================================");
		
		GamingMouse gm = new GamingMouse();
		gm.click();
		gm.rightClick();
		gm.wheel();
		gm.adjSen();
		
		System.out.println("============================================");
		
		SpeedMouse sm = new SpeedMouse();
		sm.click();
		sm.rightClick();
		sm.wheel();
		
	}

}
