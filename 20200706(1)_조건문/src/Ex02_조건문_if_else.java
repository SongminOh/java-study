import java.util.Scanner;

public class Ex02_조건문_if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // sc대신 scan이라 써도 됨
		System.out.print("점수를 입력하세요 : ");
		int grade = sc.nextInt();

		if (grade >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
}
