package while��;

import java.util.Scanner;

public class Ex01_while�� {

	public static void main(String[] args) {

		// Ű����� ���� �Է� ����
		// ���� 10���� ū ��쿡�� ����

		Scanner sc = new Scanner(System.in); // ���� �Է¹޴� ����(scanner)�� �ҷ���

		//while(���ǽ�)         input < 10�� ��������.. �ȿ��� ������ �ȵż� �ȵ�
		while (true) {
			System.out.print("���� �Է� : ");
			int input = sc.nextInt();
			if (input > 10) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}

	}

}
