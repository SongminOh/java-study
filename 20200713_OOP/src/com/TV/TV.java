package com.TV;

public class TV {

	//필드 (속성) 구성
	int channel = 1;
	int vol;
	int light;
	//on /off
	boolean power = false;		//초기화_ TV 꺼진상태
	
	//외부입력 - String 편성표 - String 유료서비스 가입여부 - boolean
	
	//기능(메소드) 구현 ----- 필드(속성)와 관련된 메소드 구성
	public void channelUp() {//메소드 실행 시 채널이 1증가.(TV에 있는 채널 '위로' 버튼)
		channel++;							 //syso(channel++);	
	}	
	//채널 아래 버튼
	public void channelDown() {			//public int channelDown2() {
		channel--;						    //return channel--;
	}
	//볼륨 업버튼
	public void volUp() {
		vol++;
	}
	//볼륨 다운버튼
	public void volDown() {
		vol--;
	}
	//밝기 업 / 다운 버튼
	public void lightUp() {
		light++;
	}
	public void lightDown() {
		light--;
	}
//	// 전원 온오프 버튼
//	public boolean powerOn() {			//public void powerOn(){
//		return power = true;			//	power = true;
//	}
//	public boolean powerOff() {
//		return power = false;
//	}
	public void powerOnOff() {
		if(power) {
			power = false;		//power true일때 전원 켠 후, false로 바꿔줌(왜? false누르면 전원 꺼지게끔)
		} else {
			power = true;		//power false일때 전원 끈 후, true로 바꿔줌
		}
	}
//	public void powerOnOff() {
//		power=power?  false:true;
//	}
//	public void powerOnOff() {
//		power = !power;
//	}
}

