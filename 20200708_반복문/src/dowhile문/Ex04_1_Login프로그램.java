package dowhile��;

import java.util.Scanner;

public class Ex04_1_Login���α׷� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է��� �ּ��� >> ");
		String id = sc.next();
		System.out.println("��й�ȣ�� �Է��� �ּ��� >> ");
		String pw = sc.next();
		
		if ( id.equals("Hello") && pw.equals("1234") ) {
			System.out.println("�α��� ����!");
//		} else if (id.equals("Hello")) {
//			System.out.println("��й�ȣ ����");
//		} else if (pw.equals("1234")) {
//			System.out.println("���̵� ����");
		} else {
			System.out.println("���̵�� ��й�ȣ�� �߸��Ǿ����ϴ�.");
		}
		
		
	}

}
