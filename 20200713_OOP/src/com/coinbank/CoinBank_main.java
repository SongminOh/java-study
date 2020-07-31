package com.coinbank;

import java.util.Scanner;

public class CoinBank_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CoinBank piggy = new CoinBank();
		
		while (true) {
			System.out.print("1.저금 2.인출 3.금액확인 4.종료 >> ");
			int click = sc.nextInt();
			
			if (click == 1) {
				System.out.print("저금할 금액을 입력하세요 ");
				int input_money = sc.nextInt();
				piggy.deposit(input_money);
				
			} else if (click == 2) {
				System.out.print("인출할 금액을 입력하세요 ");
				int output_money = sc.nextInt();
				piggy.withdraw(output_money);		//여기에 if-else문 쓰지 않고 CoinBank.java에 씀(main에 쓰는건 절차지향)
				
			} else if (click == 3) {
				piggy.showMoney();
				
			} else if (click == 4) {
				System.out.println("종료 되었습니다");
				break;
				
			} else {
				System.out.println("다시 입력하세요");
			}
		}
		
		
		
		

	}

}
