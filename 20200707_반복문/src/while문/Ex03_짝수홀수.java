package while��;

import java.util.Scanner;

public class Ex03_¦��Ȧ�� {

	public static void main(String[] args) {
		// 1. �����Է�
		// 2. ¦������ Ȧ������ �Ǻ�
		// 3. ¦�������� Ȧ�������� ����!
		// 4. ����� �մϴ�!
		// 5. 1~4 �� �ݺ��մϴ�. ��, -1�� �Է��ϸ� ����
		
		Scanner sc = new Scanner(System.in);

		int even = 0;
		int odd = 0;

		while (true) {
			System.out.print("�����Է�: ");
			int input = sc.nextInt();	//������ �Է¹޴� �κ�
			// ¦���� Ȧ���� �Ǻ�!
			if (input == -1) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			if (input % 2 == 0) { //else if �� ����if���� ��� �ᵵ ��.
				//¦��
				even += 1;			    // even++    <<�̿Ͱ��� �ᵵ ��
			} else {
				//Ȧ��
				odd += 1;		     	// odd++
			}
			System.out.println("¦������: " + even);
			System.out.println("Ȧ������: " + odd);
		}
	}

}
