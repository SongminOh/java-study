package 기초;

public class Ex03_사칙연산메소드 {
	public static void main(String[] args) {

		add(3, 5);
		sub(3, 5);
		mul(3, 5);
		div(3, 5);
		
	}
	
	//add,sub,mul,div -> 매개변수 2개를 받음! 정수형 매개변수 / 리턴타입X
	
	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	public static void sub(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	public static void div(int num1, int num2) {
		System.out.println(num1 / num2);
	}
	
	
}
