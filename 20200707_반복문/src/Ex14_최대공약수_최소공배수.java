import java.util.Scanner;

public class Ex14_�ִ�����_�ּҰ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. �ΰ��� ���ڸ� �Է�
		System.out.println("ù ���� ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();

		int max = 0;
		for (int i = 1; i > 0; i++) {
			// 2. �� ���ڰ� ������ �������� ��
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println(i);
				max = i;
				break;
			}
		}

		//10�̶� 15�� �ּ� �������? 30!
		// �ּҰ������? 10�� ���, 15�� ����� ����� ��� �� ���� ���� ��
		// 10*15 = 150
		// 150 / 5 = 30
	}

}
