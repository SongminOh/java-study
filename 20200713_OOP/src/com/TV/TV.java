package com.TV;

public class TV {

	//�ʵ� (�Ӽ�) ����
	int channel = 1;
	int vol;
	int light;
	//on /off
	boolean power = false;		//�ʱ�ȭ_ TV ��������
	
	//�ܺ��Է� - String ��ǥ - String ���Ἥ�� ���Կ��� - boolean
	
	//���(�޼ҵ�) ���� ----- �ʵ�(�Ӽ�)�� ���õ� �޼ҵ� ����
	public void channelUp() {//�޼ҵ� ���� �� ä���� 1����.(TV�� �ִ� ä�� '����' ��ư)
		channel++;							 //syso(channel++);	
	}	
	//ä�� �Ʒ� ��ư
	public void channelDown() {			//public int channelDown2() {
		channel--;						    //return channel--;
	}
	//���� ����ư
	public void volUp() {
		vol++;
	}
	//���� �ٿ��ư
	public void volDown() {
		vol--;
	}
	//��� �� / �ٿ� ��ư
	public void lightUp() {
		light++;
	}
	public void lightDown() {
		light--;
	}
//	// ���� �¿��� ��ư
//	public boolean powerOn() {			//public void powerOn(){
//		return power = true;			//	power = true;
//	}
//	public boolean powerOff() {
//		return power = false;
//	}
	public void powerOnOff() {
		if(power) {
			power = false;		//power true�϶� ���� �� ��, false�� �ٲ���(��? false������ ���� �����Բ�)
		} else {
			power = true;		//power false�϶� ���� �� ��, true�� �ٲ���
		}
	}
//	public void powerOnOff() {
//		power=power?  false:true;
//	}
//	public void powerOnOff() {
//		power = !power;
//	}
}

