package array;

import java.util.Scanner;

public class Ex03_arr3 {

	public static void main(String[] args) {
		String name [] = {"����", "Ȳ�ص�", "������", "�ڿ�ȣ", "����", "������"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻� �� �̸��� �Է��ϼ���. >>");
		String s = sc.next();		// ���ڸ� �Է� �޴� ���
		
		for (int i = 0; i < name.length; i++) {
			
			if(s.equals(name[i])) {
				System.out.println(s+ "���� " + i + "��° �ε����� �ֽ��ϴ�.");
				break;
			}
			
			//System.out.println(s+"���� " + i + "��° �ε����� ���� �Ǿ� �ֽ��ϴ�.");
		}
		
		
		
		
	}

}
