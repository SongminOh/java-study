package dowhile��;

import java.util.Random;
import java.util.Scanner;

public class Ex06_���ٿ����_�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//����� �Է¿�
		Random random = new Random();	//���� �����
		
		System.out.println("====1~100���� ���ڸ� �����ּ���!!!===");
		int num = random.nextInt(100) + 1; 	//1~100 ���� ����
		
		int cnt = 0;
		while (++cnt<=7) {			//while(true) {
//			cnt++;				
//			if(cnt>7) {			
//				System.out.println("7ȸ�� �Ѿ����ϴ�. �̾��ؿ�~!!");	
//				break;			
//			}
			System.out.print("1���� 100���� ������ �Է��ϼ���>>");
			int input = sc.nextInt();
			
			if(num == input) {
				System.out.println(num + "�����Դϴ�!!!");
				break;
			} else if (num>input) {
				System.out.println("�� ū���� �ٽ� �õ��غ�����.");
			} else if (num<input) {
				System.out.println("�� �������� �ٽ� �õ��غ�����.");
			}
		}
		
	}

}
