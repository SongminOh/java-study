package dowhile��;

import java.util.Scanner;

public class Ex02_�����Դ޼� {

	public static void main(String[] args) {

		int weight = 0;
		int goal = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("��������� : ");
		weight = sc.nextInt();
		System.out.print("��ǥ������ : ");
		goal = sc.nextInt();

		// ������ ���� ����
		int week = 1;

		// do-while�� ���!!!
		do {
			// �ݺ��� ����
			// ������ ������
			System.out.print(week++ + "���� ���� ������ : ");
			// week += 1;
			int minus = sc.nextInt();
			// ���� �����Կ� ������Ű�鼭 ����!
			weight -= minus; // weight = weight - minus;

			// ���� �����԰� ��ǥ�����Ժ��� �۰ų� ������
			if (weight <= goal) {
				System.out.println(weight + "kg�޼�!!! �����մϴ�!");
				break;
			}
		} while (true); // while(

	}
}