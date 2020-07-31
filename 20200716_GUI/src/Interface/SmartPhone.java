package Interface;

public class SmartPhone implements Phone, Internet {
	//상속: extends   인터페이스 구현하다,구현받았다: implements
	//추상"클래스" => 다중상속 지원 안됨
	//상속과 구현이 동시에 가능하다
	
	@Override
	public void call() {
		System.out.println("스마트폰 전화받기");
	}

	@Override
	public void pick() {
		System.out.println("초광각 사진기로 찰칵!");
	}

	@Override
	public void internet() {
		// TODO Auto-generated method stub
		
	}	

	
	
}
