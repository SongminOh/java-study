import java.util.Scanner;

public class prcatice_���׿����� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		/*
		String a = num + "��(��) Ȧ���Դϴ�.";
		String b = num + "��(��) ¦���Դϴ�.";
		
		
		String c = num % 2 != 0? a : b;
		System.out.println(c);
		*/
		
		//���׿����ڸ� ����ؼ� ¦�� Ȧ���� �Ǻ�
		String result = num % 2 == 0 ? "¦��" : "Ȧ��";
		System.out.println(num + "��(��) " + result + "�Դϴ�.");
	}
}
