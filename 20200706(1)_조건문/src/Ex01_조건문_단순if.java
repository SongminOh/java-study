import java.util.Scanner;		//����ڰ� �����Ѱ� ������ ��� �ִ°��� ��Ȯ�� ����ؾ��� ('java.till���ִ� scanner����ϰڴ�')

public class Ex01_���ǹ�_�ܼ�if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");			// ��¹�
		int age = sc.nextInt();					//'sc��. ������ �Է� �޾���' (����ڰ� ������ �Է��� �� ���� �����)
												// �Է������� console ������ Terminate ������!
												// �Է� �� �ʷϺ�. age�� �� �Էµ�.
		if (age >= 20) {
			System.out.println("�����Դϴ�.");
		}
		// else {
		//	System.out.println("������ �ƴմϴ�.");
		// }
	}
}
