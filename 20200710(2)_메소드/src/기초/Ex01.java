package 기초;

public class Ex01 {
	public static void main(String[] args) {
		//void -> 리턴타입이 없다!
		//JVM -> java virtual machine
	
		//메소드는 이름을 불러주면 됨
		int result = addNum(4,17);
		System.out.println(result);
	}
	
	//메소드 생성을 할 때는 main 밖에! 단, class안에!
	public static int addNum (int num1, int num2) {
//1.접근제한자 2.저장공간 3.리턴타임 4.메소드이름 5.()매개변수,Parameter 	
		int result = num1 + num2;
		return result; //리턴을 만나면 메소드는 종료!
		//리턴은 단 한번, 하나의 값만 가능 (per method)
	}
	
}
