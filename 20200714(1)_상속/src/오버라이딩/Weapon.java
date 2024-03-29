package 오버라이딩;

public abstract class Weapon {
	//추상클래스 : 추상메소드를 1개이상 가지고 있는 클래스
	//추상클래스는 객체생성 못함

	//Weapon이라는 클래스는 모든무기가 가지고 있는 기능을 정의

	//추상메소드
	//안에 기능이 구현되어있지 않은 메소드 ==> 아래와같이 {} 없음
	// 기능: 서브클래스(=자식클래스)에서 반드시 "오버라이딩"하여 구현해야함. -----> 강제성 부여
	public abstract void attack();
	public abstract void stab();
	
	//추상클래스는 반드시 추상메소드가 존재해야하는 것은 아님
	//추상 메소드가 아닌 일반 메소드도 사용 가능
	
	
	
	
}
