package while��;

import java.util.Scanner;

public class Ex02_������Ű�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. ���ڸ� �Է�
		//2. �Է¹��� ���ڸ� �����ؼ� ���
		//3. 1~2�� �ݺ��ϴµ�, �� -1�� �Է��ϸ� �����ϴ� ���α׷�
		
		int sum = 0;		//�ʱ�ȭ  : ������ ���� �� �� �Ҵ��� �ִ� ��
				
		while (true) {
			System.out.print("���� �Է�: ");
			int input = sc.nextInt();
			sum += input;
			System.out.println("�������: " + sum);
			if (input == -1) {
				System.out.println("����Ǿ����ϴ�.");
				break;	// �ݺ����� ���ߴ� Ű����
			}
			
		}
		
	}

}
