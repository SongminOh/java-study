package dowhile��;

import java.util.Random;
import java.util.Scanner;

public class Ex05_PlusGame2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		System.out.println("===Plus Game===");

		String yesno = "Y";		//���� ��, "�ʱ갪" �ʿ� �ڡڡ�

		do {
			int ranNum1 = ran.nextInt(10) + 1;
			int ranNum2 = ran.nextInt(10) + 1;
			System.out.print(ranNum1 + "+" + ranNum2 + "=");
			int input = sc.nextInt();
			
			if (input == ranNum1 + ranNum2) {
				System.out.println("Success");
				///// break;						
			} else {
				System.out.println("Fail");
				System.out.print("��� �Ͻðڽ��ϱ�? >> ");
				yesno = sc.next();
			}
		} while (yesno.equals("Y") || yesno.equals("y")); // {
		
		System.out.println("�����մϴ�.");
//				break;
//			} else (yesno.equals("Y")) {
//				continue;
//			}

	}

}
