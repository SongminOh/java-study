
public class Ex03연산자 {

	public static void main(String[] args) {

		// 나누었을 때 소수점이 나오려면..?
		int num1 = 10;
		int num2 = 7;
		
		float num3 = 10;
		float num4 = 7f;   //float이라고 알려주는 방법
		
		System.out.println(num1/num2);
		System.out.println(num3/num4);
		// 정수/정수=정수,  실수/실수=실수, "정수/실수=실수"
		//자동형변환
		System.out.println(num1/num4);
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1%num2);
	}

}
