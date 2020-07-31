package dowhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex06_업다운게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		System.out.println("======1부터 100 사이 숫자 맞추기 게임!=====");

		int input; /////
		int ranNum = ran.nextInt(100) + 1;
		int chance = 7;

		do {
			System.out.print("1과 100사이의 정수를 입력하세요 >>");
			input = sc.nextInt();

			chance--;

			if (input > ranNum && chance > 0) {
				System.out.println("더 작은 수로 다시 시작해보세요");
				System.out.println("남은 기회.. >> " + chance + "회");
			} else if (input < ranNum && chance > 0) {
				System.out.println("더 큰 수로 다시 시도 해보세요");
				System.out.println("남은 기회.. >> " + chance + "회");
			} else if (input == ranNum && chance > 0) {
				System.out.println(input + " 정답입니다!!");
				break;
			} else if (chance <= 0) {
				System.out.println("문제풀기 실패!");
				break;
			}

		} while (true);

	}

}
