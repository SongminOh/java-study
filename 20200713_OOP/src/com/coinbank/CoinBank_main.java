package com.coinbank;

import java.util.Scanner;

public class CoinBank_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CoinBank piggy = new CoinBank();
		
		while (true) {
			System.out.print("1.���� 2.���� 3.�ݾ�Ȯ�� 4.���� >> ");
			int click = sc.nextInt();
			
			if (click == 1) {
				System.out.print("������ �ݾ��� �Է��ϼ��� ");
				int input_money = sc.nextInt();
				piggy.deposit(input_money);
				
			} else if (click == 2) {
				System.out.print("������ �ݾ��� �Է��ϼ��� ");
				int output_money = sc.nextInt();
				piggy.withdraw(output_money);		//���⿡ if-else�� ���� �ʰ� CoinBank.java�� ��(main�� ���°� ��������)
				
			} else if (click == 3) {
				piggy.showMoney();
				
			} else if (click == 4) {
				System.out.println("���� �Ǿ����ϴ�");
				break;
				
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
		
		
		
		

	}

}
