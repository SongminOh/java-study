package 기초;

public class Ex02_다양한메소드 {

	public static void main(String[] args) {

		//메소드를 사용하려면? 메소드의 이름을 불러요!
		printHi();
		System.out.println(printNum());
		printNum2(4,10);
	}
	//리턴타입X, 매개변수X -> 이 메소드의 이름은 printHi
	public static void printHi() {
		System.out.println("녹화못해서 미안해요.....주륵..");
	}
	//리턴타입O, 매개변수X
	public static int printNum() {
		return 4;
	}
	//리턴타입X, 매개변수O
	public static void printNum2(int num1, int num2) {
		System.out.println(num1*num2);
	}
}
