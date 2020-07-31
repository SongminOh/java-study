package while문;

import java.util.Scanner;

public class Ex01_while문 {

	public static void main(String[] args) {

		// 키보드로 값을 입력 받음
		// 값이 10보다 큰 경우에만 종료

		Scanner sc = new Scanner(System.in); // 값을 입력받는 도구(scanner)를 불러옴

		//while(조건식)         input < 10는 지역변수.. 안에서 선언이 안돼서 안됨
		while (true) {
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();
			if (input > 10) {
				System.out.println("종료되었습니다.");
				break;
			}
		}

	}

}
