package dowhile��;

import java.util.Scanner;

public class Ex04_4_Login_3ȸ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int chance = 0;

		while (true) {
			System.out.print("���̵� �Է��� �ּ��� >> ");
			String id = sc.next();
			System.out.print("��й�ȣ�� �Է��� �ּ��� >> ");
			String pw = sc.next();

			if (id.equals("Hello") && pw.equals("1234")) {
				System.out.println("�α��� ����!");
				break;
			} else {
				chance++;	//Ƚ���� 1�� ������Ŵ
				if(chance>=3) {
					System.out.println("���̵�� ��й�ȣ�� 3ȸ Ʋ�Ƚ��ϴ�. ���������� ���ּ���.");
					break;
				}
				System.out.println("���̵�� ��й�ȣ�� �߸��Ǿ����ϴ�.");
				System.out.println("��� �Ͻðڽ��ϱ� ? (Y/N) >>");
				String check = sc.next();
				if (check.equals("N")) {
					System.out.println("�����մϴ�.");
					break;
				} // else {
					// continue;
					// }
			}
			//if (chance == 4) {
				//System.out.println("���̵�� ��й�ȣ�� 3ȸ Ʋ�Ƚ��ϴ�. ���������� ���ּ���.");
				//break;
			//}
		}

	}

}
