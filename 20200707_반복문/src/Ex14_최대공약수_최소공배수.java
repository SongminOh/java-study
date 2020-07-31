import java.util.Scanner;

public class Ex14_최대공약수_최소공배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. 두가지 숫자를 입력
		System.out.println("첫 번재 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();

		int max = 0;
		for (int i = 1; i > 0; i++) {
			// 2. 두 숫자가 나누어 떨어지는 수
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println(i);
				max = i;
				break;
			}
		}

		//10이랑 15의 최소 공배수는? 30!
		// 최소공배수란? 10의 배수, 15의 배수의 공통된 배수 중 가장 작은 수
		// 10*15 = 150
		// 150 / 5 = 30
	}

}
