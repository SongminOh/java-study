package ���;

public class SpeedMouse extends WheelMouse{

	public void click() {
		System.out.println("������ ��Ŭ��");
	}
	
	@Override // ������̼�
	public void rightClick() {
		System.out.println("������ ��Ŭ��");
	}

	@Override
	public void wheel() {
		System.out.println("������ ��");
	}
	
}
