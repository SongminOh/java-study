import java.util.Scanner;

public class Ex08���ǹ�_switch�ǽ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int totalScore = sc.nextInt();
		
		//���ǹ�switch-case
		//�� �������� ��
		switch (totalScore/10) {
		case 10 :
		case 9 :
			System.out.println("A�����Դϴ�!");
			break;
		case 8 :
			System.out.println("B�����Դϴ�!");
			break;
		case 7 :
			System.out.println("C�����Դϴ�!");
			break;
		default :
			System.out.println("D�����Դϴ�!");
			break;
		}
	}
}
