import java.util.Scanner;

public class Ex07_�Է±����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int dan = sc.nextInt();
		System.out.print("���� �Է� : ");
		int range = sc.nextInt();

		// 4�� ���� 6���� �Է�
		for (int i = 1; i <= range; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}

	}

}
