import java.util.Scanner;

public class Ex07���ǹ�_switch {

	public static void main(String[] args) {
		
		int data = 2;
		
		//switch(�� �������� ��)     // (data%2)����. (data%2==0)�Ұ���
		switch(data) {         
		case 1:
			System.out.println("data�� 1�Դϴ�.");
			break;      //���ǹ��̳� �ݺ����� Ż���ϴ� Ű����
		case 2:
			System.out.println("data�� 2�Դϴ�.");
			break;
		case 3:
			System.out.println("data�� 3�Դϴ�.");
			break;
		default:
			System.out.println("data�� 1,2,3�� ������ �ʽ��ϴ�.");
			break;
		}
	}
}
