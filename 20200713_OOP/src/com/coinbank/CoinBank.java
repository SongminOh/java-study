package com.coinbank;

public class CoinBank {
	
	int money;	//������ �ִ� ��
	
	//���� ��� ������
	public void deposit(int input_money) {// ���� �ִ� ���		//void ��� int
		money = money + input_money;
//		return money
	}
	//���� ���� ���
	public void withdraw(int output_money) {
		if(money < output_money) {					//���⿡ ���°� �� ����(CoinBank_main�� if-else�� ���� ĸ��ȭ�� ��߳�)
			System.out.println("�ܾ��� �����մϴ�.");
		} else {
		money -= output_money;
		}
	}
	//���� ����ϴ� ���
	public void showMoney() {
		System.out.println(money);		//return money;
	}
	
	
}
