package Interface;

public interface Phone extends Camera {
	//인터페이스의 특징
	//1.(interface내부에는) 추상메소드만 존재가능
	//	 추상메소드: 서브클래스가 "재정의"하게끔(강제) 만든 메소드
	//2.변수 설정 불가
	//3.인터페이스간 기능 확장시 extends 키워드 사용
	//4.확장시 기능 구현 X
	
	//jdk 1.7버전까지는 상수만 가능했습니다.
	//추상메소드만 가능
	int num = 10;
	
	//abstract 생략! (public 다음)
	public void call();
	
	//========================================================================이하 TIP
	//jdk1.8버전부터 default 메소드 선언 가능
	default void receive() {
		System.out.println("전화 받기");
	}

	//jdk1.9버전부터 private메소드 선언 가능
//	private void msn() {
//		System.out.println("hello");
//	}
	
	
	
	
	
	
	
	
}
