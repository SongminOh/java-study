import java.util.Scanner;

public class Ex03�迭�ǽ�2_�̸�ã�� {
	public static void main(String[] args) {
		// 1step. ���̰� 3�� ���ڿ� �迭 names�� �����Ͻÿ�.

		String[] names = new String[3];

		// 2step. names ��� �ε��� �ȿ� Ű����κ��� �̸��� �Է��Ͽ� �����Ͻÿ�.
		// 0��° �ε������� 2���� �ε������� �����Ͻø� �˴ϴ�
		// ��: �̸��Է� : �ں��� -> names[0]��° ����
		// �̸��Է� : ������ -> names[1]��° ����
		// �̸��Է� : ���¾� -> names[2]��° ����

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < names.length; i++) {
			System.out.print("�̸��Է� : ");
			names[i] = sc.next(); // i= 0~2
		}

		// 3step. ã����� �̸��� �Է¹��� �� ��ġ�ϴ� ����� �ִٸ� ���° �ε����� �ִ��� �˷��ֱ�
		// ��: ã�������� �̸� : �ں���
		// �ں����� 0��°�� �����մϴ�.

		System.out.print("ã����� �̸� : ");
		String searchName = sc.next();

		for (int i = 0; i < names.length; i++) {
			if (searchName.equals(names[i])) {
				System.out.println(searchName + "��" + i + "��°�� �����մϴ�.");
			}
		}

	}
}
