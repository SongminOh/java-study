import java.util.Scanner;

public class Ex02_for���ѷ��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// for�� ���ѷ��� ���
		for (;;) {
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			// �Է��� ���ڰ� 0���� ������ �ݺ��� ����
			if(num < 0) {
				//�ڽ��� ���ΰ� �ִ� "���� ����� �ݺ���"��
				// "����"�ϴ� Ű����
				// break;
				break;
			}
		}
		
	}

}
