package com.coinbank;

public class CoinBank {
	
	int money;	//기존에 있는 돈
	
	//돈이 들어 왔을때
	public void deposit(int input_money) {// 돈을 넣는 기능		//void 대신 int
		money = money + input_money;
//		return money
	}
	//돈을 빼는 기능
	public void withdraw(int output_money) {
		if(money < output_money) {					//여기에 쓰는게 더 나음(CoinBank_main에 if-else문 쓰면 캡슐화에 어긋남)
			System.out.println("잔액이 부족합니다.");
		} else {
		money -= output_money;
		}
	}
	//돈을 출력하는 기능
	public void showMoney() {
		System.out.println(money);		//return money;
	}
	
	
}
