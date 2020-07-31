package 상속;

public class SpeedMouse extends WheelMouse{

	public void click() {
		System.out.println("빠르게 좌클릭");
	}
	
	@Override // 어노테이션
	public void rightClick() {
		System.out.println("빠르게 우클릭");
	}

	@Override
	public void wheel() {
		System.out.println("빠르게 휠");
	}
	
}
