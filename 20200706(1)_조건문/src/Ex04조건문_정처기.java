import java.util.Scanner;

public class Ex04���ǹ�_��ó�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int db = sc.nextInt();
		System.out.print("���ڰ��� ���� : ");
		int ���ڰ��ⱸ�� = sc.nextInt();
		System.out.print("OS : ");
		int os = sc.nextInt();
		System.out.print("��������� : ");
		int ��������� = sc.nextInt();
		System.out.print("����Ʈ������� : ");
		int ����Ʈ������� = sc.nextInt();
		
		int total = db + ���ڰ��ⱸ�� + os + ��������� + ����Ʈ�������;
		/* ���հ��� ���� -> 5���� ���� �� �ϳ��� 8�� �̸��� ���, ������ 60�� �̸��� ���
		if ( DB<8 || ���ڰ��ⱸ��<8 || OS<8 || ���������<8 || ����Ʈ�������<8 || total<60 )
		  	System.out.println("���հ��Դϴ�!");
		 else
		    System.out.println("�հ��Դϴ�!");
		 */
		
		if ( (! ((db>=8)&&(���ڰ��ⱸ��>=8)&&(os>=8)&&(���������>=8)&&(����Ʈ�������>=8)) ) || (total < 60) ) {
			System.out.println("���հ��Դϴ�!");
		} else if (total >= 60) {
			System.out.println("�հ��Դϴ�!");
		}
	}
}
