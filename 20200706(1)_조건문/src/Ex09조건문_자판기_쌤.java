import java.util.Scanner;

public class Ex09���ǹ�_���Ǳ�_�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���.");
		int money = sc.nextInt();
		// �ݾ��� �Է¹޴� �κ�

		System.out.println("�޴��� ������.");
		System.out.println("1.�ƿ���(700��) 2.�̱�����(1000��) 3.���׸�(500��)");
		int choice = sc.nextInt();
		// menu�� �����ϴ� �κ�

		switch (choice) {
		case 1:
			money -= 700; // money = money - 700;
			break;
		case 2:
			money -= 1000; // money = money - 1000;
			break;
		case 3:
			money -= 500; // money = money - 500;
			break;
		default:
			System.out.println("�߸��� �޴��� �Է��ϼ̾��!");
		}

		if (money > 0) {
			// �ܵ��� 0�� �̻��϶��� ���
			System.out.println("�ܵ� : " + money + "��");
			// ex) 9500���̶�� �ܵ� -> õ��¥����? 9��! �����¥����? 1��!
			System.out.println("õ�� : " + money/1000 + "��");
			System.out.println("����� : " + money % 1000 /500 + "��");
			System.out.println("��� : " + money % 500 / 100 + "��");
			
		} else {
			// �ܵ� ������� ���� �����ϴٰ� ���!
			System.out.println("���� �����ؿ�ФФе������...");
		}

		// �ܵ����� õ��¥���� �� ������, �����¥���� �� ������, ���¥���� �� ������ ���.

	}
}
