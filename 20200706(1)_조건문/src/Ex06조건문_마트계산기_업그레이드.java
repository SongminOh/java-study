import java.util.Scanner;

public class Ex06���ǹ�_��Ʈ����_���׷��̵� {

	public static void main(String[] args) {
		// ��Ʈ ���� ���׷��̵�
		// 1��° ���� ���θ��
		// 		11��(��Ʈ) �̻� ���Ž� ���� ��Ʈ �ϳ� ������ 10% ����
		// 2��° ���� ���θ��
		// 		10�����̷� ���Ž� ���� ��Ʈ �ϳ� ������ 5% ����
		// ex)
		// 9�� ���Ž� ���� �ϳ��� 10000 ����
		// 10�� ���Ž� ���� �ϳ��� 9500 ����		 -> 5���� ����(10������ �Ѽ�Ʈ0
		// 13�� ���Ž� ���� �ϳ��� 9000 ���� 	 -> 10���� ����(11���̻�)
		// 20�� ���Ž� ���� �ϳ��� 8500 ���� 	 -> 15���� ����(10��� && 11�� �̻�)
		// 30�� ���Ž� ���� �ϳ��� 8500 ���� 	 -> 15���� ����(10��� && 11�� �̻�)

		Scanner sc = new Scanner(System.in);
		int total = 0;
		int price = 10000;

		System.out.print("�����Ϸ��� ������Ʈ ���� : ");
		int cnt = sc.nextInt();

		if ((cnt % 10 == 0) && (cnt == 10)) {
			total = (int) (cnt * price * 0.95);
		} else if ((cnt % 10 == 0) && (cnt > 10)) {
			total = (int) (cnt * price * 0.85);
		} else if ((cnt % 10 != 0) && (cnt < 11)) {
			total = cnt * price;
		} else if ((cnt % 10 != 0) && (cnt >= 11)) {
			total = (int) (cnt * price * 0.9);
		}
		System.out.println("������ �ݾ� : " + total + "��");
	}
}
