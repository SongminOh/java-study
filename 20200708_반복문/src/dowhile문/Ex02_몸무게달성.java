package dowhile��;

import java.util.Scanner;

public class Ex02_�����Դ޼� {

	public static void main(String[] args) {

		int current;
		int goal;  
		int week = 1;
		//int lost = 0;      >>> do �ȿ��� �����ص� ��.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��������� : ");
		current = sc.nextInt();
		System.out.print("��ǥ������ : ");
		goal = sc.nextInt();

		do {
			System.out.print(week + "���� ���� ������ : ");
			int lost = sc.nextInt();
			current -= lost;
			week += 1;
		} while (current > goal);
		System.out.println(current + "kg �޼�!! �����մϴ�!!");

	}

}
