import java.util.Scanner;

public class Ex02_���ǹ�_if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // sc��� scan�̶� �ᵵ ��
		System.out.print("������ �Է��ϼ��� : ");
		int grade = sc.nextInt();

		if (grade >= 60) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
}
