package dowhile��;

import java.util.Random;
import java.util.Scanner;

public class Ex06_���ٿ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		System.out.println("======1���� 100 ���� ���� ���߱� ����!=====");

		int input; /////
		int ranNum = ran.nextInt(100) + 1;
		int chance = 7;

		do {
			System.out.print("1�� 100������ ������ �Է��ϼ��� >>");
			input = sc.nextInt();

			chance--;

			if (input > ranNum && chance > 0) {
				System.out.println("�� ���� ���� �ٽ� �����غ�����");
				System.out.println("���� ��ȸ.. >> " + chance + "ȸ");
			} else if (input < ranNum && chance > 0) {
				System.out.println("�� ū ���� �ٽ� �õ� �غ�����");
				System.out.println("���� ��ȸ.. >> " + chance + "ȸ");
			} else if (input == ranNum && chance > 0) {
				System.out.println(input + " �����Դϴ�!!");
				break;
			} else if (chance <= 0) {
				System.out.println("����Ǯ�� ����!");
				break;
			}

		} while (true);

	}

}
