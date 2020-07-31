package com.TV;

public class TV_main {
	public static void main(String[] args) {
		
		//객체 만드는 방법 ------> Scanner
		//에러 뜬다면? 대소문자 구별
		TV lgTv = new TV();
		
		lgTv.channel = 20;
		lgTv.power = false;
		
		
		System.out.println(lgTv.channel);
		System.out.println(lgTv.light);
		System.out.println(lgTv.vol);
		System.out.println(lgTv.power);
		
		System.out.println("---------------------");
		
		lgTv.powerOnOff();		//false로 거짓 --> true로 바꿔줬었음
		System.out.println(lgTv.power);
		lgTv.channelUp();
		System.out.println(lgTv.channel);
		
		lgTv.volUp(); 	//0 then(+1)
		lgTv.volUp();	//=1 (+1)
		lgTv.volUp();	//=2 (+1)
		lgTv.volUp();	//=3 (+1)
		lgTv.volUp();	//=4 (+1)
		System.out.println(lgTv.vol);	//=5
		
		
		TV samsungTv = new TV();
		samsungTv.volUp();
		System.out.println(samsungTv.vol);
		
		
		
	}
}
