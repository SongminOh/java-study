import java.util.Scanner;

public class Ex09���ǹ�_���Ǳ����α׷� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money, menu, change = 0;
		int �ƿ��� = 700;
		int �̱����� = 1000;
		int ���׸� = 500;

		System.out.println("�ݾ��� �Է��ϼ���.");
		money = sc.nextInt();

		System.out.println("�޴��� ������.");
		System.out.print("1.�ƿ���(700��) 2.�̱�����(1000��) 3.���׸�(500��) >> ");
		menu = sc.nextInt();

		if ((menu == 1) && (money > �ƿ���)) {
			change = money - �ƿ���;
		} else if ((menu == 2) && (money > �̱�����)) {
			change = money - �̱�����;
		} else if ((menu == 3) && (money > ���׸�)) {
			change = money - ���׸�;
		} else if (money < �ƿ��� || money < �̱����� || money < ���׸�) {
			change = money;                   //// �ݾ׺����϶� �ܵ��� �߰� �ϱ����ؼ��� �̿Ͱ��� change���� ���⼭ ����� ��! �ڡڡڡڡ�
			System.out.println("�ݾ��� �����մϴ�.");
		}
		//change��� ���ο� ������ �ܵ��� ��Ƽ� �׷���ϴ�! �ڡڡڡڡ�
		//�̷��� Ǯ�����ؼ����~ �̷��� ���ֽø� �ɰſ���!�ڡڡڡڡ�
		System.out.println("�ܵ� : " + change + "��");
		System.out.println("õ�� : " + (change / 1000) + "��");
		System.out.println("�����: " + ((change % 1000) / 500) + "��");
		System.out.println("��� : " + ((change % 500) / 100) + "��");
	}
}
