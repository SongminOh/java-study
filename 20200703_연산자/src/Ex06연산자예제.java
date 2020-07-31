
public class Ex06연산자예제 {
	public static void main(String[] args) {
		
		//1. 정수형 변수 num에 456을 넣어주세요.
		//2. 백의 자리 이하의 숫자는 버리는 코드를 만들어주세요.
		// 출력했을 때 결과값이 400이 나오게 만들어주세요
		int num = 456;
		System.out.println(num / 100);
		System.out.println(num / 100 * 100);
		
		int result = num - num % 100;
		System.out.println(result);
		
	}
	
}
