import java.util.Scanner;

public class Ex05���ǹ�_��Ʈ����_�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0; // ���� �����ؾ��ϴ� �ݾ�
		int price = 10000; //������Ʈ �� ���� ����
		
		System.out.print("�����Ϸ��� ������Ʈ ���� >> ");
		int cnt = sc.nextInt();
		// 11�� �̻��� ��� ������Ʈ �� ���� ������ 10% ����
		if (cnt >= 11) {
			total = (int)(cnt * price * 0.9);  //������ �����ϸ� ������, �������� ���� ������ ���� �����صθ� ��.
		} else {
			total = cnt * price;
		}
		System.out.println("������ �ݾ� >> " + total);
	}

}
