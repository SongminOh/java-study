import java.util.Scanner;

public class Ex03���ǹ�_�μ���ū��ã�� {

	public static void main(String[] args) {
		// Ű����κ��� ���� �Է� �޴� '����� ���� ������ Ÿ��' Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			//java������ ���ڿ�+���� ���� �ٷ� ����(�ڵ� ��ȯ ��)_ ���� �� �� ū ������ �ڵ�(������)�� ��ȯ
			System.out.println("�� ū ���� : " + num1);
		} else if (num1 < num2) {
			System.out.println("�� ū ���� : " + num2);
		} else {
			System.out.println("�� ���� �����ϴ�.");
		}
		
	}
}
