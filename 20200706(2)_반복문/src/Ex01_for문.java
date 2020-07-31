
public class Ex01_for문 {
	public static void main(String[] args) {

		// int i = 0;
		// for문 -> 반복획수가 정해져 있을 때
		// for(초기화구문; 검사조건; 반복후작업){}
		// 1부터 10까지 출력하는 프로그램
		for (int i = 1; i <= 10; i++) {
			// 지역변수 --> for문안에서 초기화된 변수는 for문 내부에서만 사용 가능.
			// i는 for문 중괄호 안에까지만 사용이 가능함
			System.out.print(i + " ");
			// i = 1
			// i = 2
			// i가 11이 되는 순간 끝이 남.
		}

		System.out.println(); // 개행을 하겠다!
		// Q1. 27부터 44까지 출력하는 프로그램 만들어주세요!
		for (int i = 27; i <= 44; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		// Q2. 44부터 27까지 출력하는 프로그램 만들어주세요!
		for (int i = 44; i >= 27; i--) {
			System.out.print(i + " ");
		}

		System.out.println();
		// Q3. 27부터 44까지의 수 중에서 홀수만 출력하는 프로그램 만들어주세요!
		for (int i = 27; i <= 44; i++) {
			if (i % 2 == 1) {				//홀수이면! i를 출력해줘
				System.out.print(i + " ");
			}
		}
		System.out.println();
		for (int i = 27; i <= 44; i +=2) {
			System.out.print(i + " ");
		}
	}
}