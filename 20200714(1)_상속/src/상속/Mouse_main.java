package ���;

public class Mouse_main {

	public static void main(String[] args) {

		//�ڹ� ����� 3���� Ư¡
		
		//1. ���߻���� �������� �ʴ´� ---> �ϳ��� ����Ŭ���� ����
		//2. ����� Ƚ���� ���ѵ��� �ʽ��ϴ�. --> �������� ����Ŭ���� Ȥ�� ��ӹ��� Ŭ������ ��� �޴� �͵� ����
		//3. ��� Ŭ������ �ֻ��� Ŭ������ Object�� ��ӹް� �ִ�.
		
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
