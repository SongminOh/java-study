import java.util.Scanner;

public class Ex05���ǹ�_��Ʈ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ��ǰ ������ �Է��ϼ���");
		int cnt = sc.nextInt();
		
		//if (cnt>=11) {
		//	System.out.println("������ " + Math.round(cnt*10000*0.9) + "�� �Դϴ�" );
		//} else {
		//	System.out.println("������ " + (cnt*10000) + "�� �Դϴ�");
		//}
		
		if (cnt>=11) {
			double pay = cnt * 10000 * 0.9;
			int i = (int)pay;
			System.out.println("������ " + i + "�� �Դϴ�");
		} else {
			System.out.println("������ " + (cnt*10000) + "�� �Դϴ�");
		}
	}
}
