package com.Car;

public class Car {

	int accel;
	boolean sidebreak;
	int prnd;
	String color;
	
	public void pushAccel() {
		accel++;
	}
	public void side() {
		if(sidebreak == true) {
			sidebreak = false;
		} else {
			sidebreak = true;
		}
	}
	
	public void prndChange() {
		if(prnd == 1) {
			System.out.println("Parking");
		} else if (prnd == 2) {
			System.out.println("Reverse");
		} else if (prnd == 3) {
			System.out.println("Neutral");
		} else if (prnd == 4) {
			System.out.println("Drive");
		}
	}
	
	public void changeColor() {
		String[] st = {"red", "green", "yellow"};
		color = st[0];
	}
	
//	boolean onOff = false;
//	boolean light = false;
//	int speed = 1;
//	int gear = 1;
//	
//	public void turnOnOff() {
//		if (onOff) {
//			onOff = false;
//		} else {
//			onOff = true;
//		}
//	}
//	public void speedUp() {
//		System.out.println("현재시속: " + (speed++));
//	}
//	public void speedDown() {
//		System.out.println("현재시속: " + (speed--));
//	}
//	public void lightOnOff() {
//		if (light) {
//			light = false;
//		} else {
//			light = true;
//		}
//	}
//	public void chgGear() {
//		switch (gear) {
//		case 1:
//			System.out.println("현재 기어 : 1단");
//			break;
//		case 2:
//			System.out.println("현재 기어 : 2단");
//			break;
//		case 3:
//			System.out.println("현재 기어 : 3단");
//			break;
//		default:
//			System.out.println("현재 기어 : 4단 이상");
//			break;
//		}
//	}
	
	
}
