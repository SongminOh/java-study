package dowhile��;

import java.util.Scanner;

public class Ex03���ں� {

	public static void main(String[] args) {

		//����=char '', ���ڿ� = String ""
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next(); //���ڿ� �Է¹޴� ���, String -> �⺻���� �ƴ�!
		
		if (name.equals("����")) {	//���ڿ��� ���ϴ� ��� -> .equlas(���� ����)
			System.out.println("����");
		}
	}

}
