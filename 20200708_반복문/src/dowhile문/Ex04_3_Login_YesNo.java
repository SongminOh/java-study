package dowhile��;

import java.util.Scanner;

public class Ex04_3_Login_YesNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���̵� �Է��� �ּ��� >> ");
			String id = sc.next();
			System.out.print("��й�ȣ�� �Է��� �ּ��� >> ");
			String pw = sc.next();

			if (id.equals("Hello") && pw.equals("1234")) {
				System.out.println("�α��� ����!");
				break;
			} else {
				System.out.println("���̵�� ��й�ȣ�� �߸��Ǿ����ϴ�.");
				System.out.println("��� �Ͻðڽ��ϱ� ? (Y/N) >>");
				String check = sc.next();
				if (check.equals("N")) {
					System.out.println("�����մϴ�.");
					break;
				} //else {
					//continue;
				//}
			}
		}

	} 

}
