
public class Ex01_for�� {
	public static void main(String[] args) {

		// int i = 0;
		// for�� -> �ݺ�ȹ���� ������ ���� ��
		// for(�ʱ�ȭ����; �˻�����; �ݺ����۾�){}
		// 1���� 10���� ����ϴ� ���α׷�
		for (int i = 1; i <= 10; i++) {
			// �������� --> for���ȿ��� �ʱ�ȭ�� ������ for�� ���ο����� ��� ����.
			// i�� for�� �߰�ȣ �ȿ������� ����� ������
			System.out.print(i + " ");
			// i = 1
			// i = 2
			// i�� 11�� �Ǵ� ���� ���� ��.
		}

		System.out.println(); // ������ �ϰڴ�!
		// Q1. 27���� 44���� ����ϴ� ���α׷� ������ּ���!
		for (int i = 27; i <= 44; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		// Q2. 44���� 27���� ����ϴ� ���α׷� ������ּ���!
		for (int i = 44; i >= 27; i--) {
			System.out.print(i + " ");
		}

		System.out.println();
		// Q3. 27���� 44������ �� �߿��� Ȧ���� ����ϴ� ���α׷� ������ּ���!
		for (int i = 27; i <= 44; i++) {
			if (i % 2 == 1) {				//Ȧ���̸�! i�� �������
				System.out.print(i + " ");
			}
		}
		System.out.println();
		for (int i = 27; i <= 44; i +=2) {
			System.out.print(i + " ");
		}
	}
}