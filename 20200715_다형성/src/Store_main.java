
public class Store_main {
	public static void main(String[] args) {
		
		//업캐스팅 다운캐스팅이 되기 위해선 -상속관계 or 인터페이스로인한 확장된 사이여야 함
		
		ParentsStore ps = new ParentsStore();
		ps.makeSuta();
		System.out.println("=======================================");
		
		ChildStore cs = new ChildStore();
		cs.makeSuta();
		cs.makeGGua();
		
		System.out.println("=======================================");
		
		//업캐스팅
		//서브클래스(자식클래스)가 슈퍼클래스(부모클래스)로 자동 타입변환 되는 것 
		//상위클래스의 필드와 메소드에 접근가능
		
		//단 서브클래스가 오버라이딩 한 경우 오버라이딩 한 메소드를 호출
		ParentsStore ps2 = new ChildStore();	//sub클래스가 super클래스화됨
		ps2.makeSuta();
		//서브클래스가 확장한 메소드는 사용 못함
		//ps2.makeGGua() --> 안됨
		
		
		//다운캐스팅
		//슈퍼클래스가 서브클래스로 "강제"형변환
//		ChildStore cs2 = (ChildStore) new ParentsStore();
//		
//		cs2.makeSuta();
//		cs2.makeGGua();
//		위 코드는 잘못된 코드로서 안되는 것 입니다. 다운캐스팅의 목적과 불일치 합니다.
		
		ChildStore cs2 = new ChildStore();
		cs2 = (ChildStore) ps2;
		cs2.makeGGua();
		cs2.makeSuta();
		
		
		
		
		
	}
}
