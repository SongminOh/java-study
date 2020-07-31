import java.util.Scanner;

public class Ex07값입력받기 {

	public static void main(String[] args) {

		//값을 입력받는 방법
		//ctrl + shift + o  혹은 import 'Scanner' (java.util) 클릭
		//1. 도구를 불러준다.
		Scanner sc = new Scanner(System.in);
		
		//ln을 지우면 개행을 없앨 수 있다		System.out.print("정수 입력 : ");
		//2. sc.nextInt() -> 실제 값을 입력받는 코드
		int input = sc.nextInt();
		
		System.out.println(input);
		
		
	}

}
