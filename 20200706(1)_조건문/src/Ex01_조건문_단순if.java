import java.util.Scanner;		//사용자가 정의한거 쓰려면 어디에 있는건지 정확히 명시해야함 ('java.till에있는 scanner사용하겠다')

public class Ex01_조건문_단순if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");			// 출력문
		int age = sc.nextInt();					//'sc야. 정수로 입력 받아줘' (사용자가 정수값 입력할 떄 까지 대기중)
												// 입력전까지 console 오른쪽 Terminate 빨간불!
												// 입력 후 초록불. age에 값 입력됨.
		if (age >= 20) {
			System.out.println("성인입니다.");
		}
		// else {
		//	System.out.println("성인이 아닙니다.");
		// }
	}
}
