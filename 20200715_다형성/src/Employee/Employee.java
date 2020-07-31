package Employee;

public abstract class Employee {		//단순하게 틀을 제공해주는 추상클래스
	
	//필드에 공통으로 들어가는 속성
	String num;
	String name;
	int money;
	
	
	//생성자
	public Employee(String num, String name, int money) {
		super();
		this.num = num;
		this.name = name;
		this.money = money;
	}
	
	public abstract double getPay(); //정규직, 계약직, 아르바이트냐에 따라 --> (오버라이딩)_다형성
		
	
	
	
}
