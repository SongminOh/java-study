import java.util.Scanner;

public class Ex07_입력구구단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		System.out.print("범위 입력 : ");
		int range = sc.nextInt();

		// 4단 범위 6까지 입력
		for (int i = 1; i <= range; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}

	}

}
