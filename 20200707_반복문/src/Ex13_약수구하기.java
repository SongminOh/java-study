import java.util.Scanner;

public class Ex13_������ϱ� {

	public static void main(String[] args) {

		//�Է¹��� ���� ��� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int input = sc.nextInt();
		//����� �ڱ��ڽ��� �������� �� �ڱ��ڽź��� Ŭ �� ����
		
		//�ִ� ����� : �ΰ��� ���� �Է¹޾Ƽ� ����� ��� ���ϱ�.
		//&& -> ���� ū �� -> �ִ�����
		
		System.out.print("��� : ");
		for (int i = 1; i <= input; i++) {
			//������ ���������� �Ǻ�!
			if (input%i==0) {
				System.out.print(i+ " ");
			}
		}
	}

}
