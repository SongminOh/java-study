package dowhile��;

import java.util.Random;
import java.util.Scanner;

public class Ex05_PlusGame1�� {

	public static void main(String[] args) {

		//����� �Է� ����
		Scanner sc = new Scanner(System.in);
//		//�Է¹޴� ���?
//		int num = sc.nextInt();
		
		//������ �� (==����)�� �̾��ִ� ����
		Random ran = new Random();
		
		System.out.println("====Plus Game====");
		
		String isContinue = "Y";
		do {
			//���� ������ ���� �̴� ���
			//nextInt(����)
			int ranNum1 = ran.nextInt(10) + 1;	// 0~9  ---> 1~10
			int ranNum2 = ran.nextInt(10) + 1;	// 0~9  ---> 1~10
			System.out.print(ranNum1+"+"+ranNum2+"=");
			int input = sc.nextInt();
			
			if(ranNum1+ranNum2==input) {
				System.out.println("Success");
			} else {
				System.out.println("Fail");
				System.out.println("����Ͻðڽ��ϱ�?(Y/N)>>");
				isContinue = sc.next();
			}
		} while(isContinue.equals("Y") || isContinue.equals("y"));
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");	
	}

}
