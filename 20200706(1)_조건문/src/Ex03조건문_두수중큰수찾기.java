import java.util.Scanner;

public class Ex03조건문_두수중큰수찾기 {

	public static void main(String[] args) {
		// 키보드로부터 값을 입력 받는 '사용자 정의 데이터 타입' Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			//java에서는 문자열+숫자 연산 바로 가능(자동 변환 됨)_ 작은 쪽 이 큰 쪽으로 자동(묵시적)형 변환
			System.out.println("더 큰 수는 : " + num1);
		} else if (num1 < num2) {
			System.out.println("더 큰 수는 : " + num2);
		} else {
			System.out.println("두 수가 같습니다.");
		}
		
	}
}
