package com.Pocketmon;

public class Pocketmon_main {
	public static void main(String[] args) {
		
		
		//1.Pocketmon설계도를 기반으로 2가지 포켓몬 만들기
		//2.pickachu 객체 생성, paili 객체 생서
		
		//pickachu -> 이름:피카츄, 레벨:1000, 타입:전기, 공격력:200, 체력:1500, 기술:백만볼트
		//paili -> 이름:파이리, 레벨:500, 타입:불, 공격력:100, 체력:1000, 기술:불꽃세례
		Pocketmon pika = new Pocketmon("전기", "백만볼트", 1000, 1500, "피카츄", 200); 
		Pocketmon pai = new Pocketmon("불", "불꽃세례", 500, 1000, "파이리", 100);
		
		
//		pika.getHp();	//값가져오는거
//		pai.setHp(2000);//값 재설정하는거

		Pocketmon[] po_array = new Pocketmon[5];
		po_array[0] = pika;
		po_array[1] = pai;
		
		
		
		System.out.println(pika.getName() + "의 공격! " + pika.getSkill()+"사용");
//		System.out.println(pai.getHp() - pika.getAttack());	//1000-200 (단순출력)
		pai.setHp(pai.getHp() - pika.getAttack());	//위의 값800으로 바꿔줌 <<수정>>
//		System.out.println(pai.getHp());	//(바뀐)<<값 가져오기>> getter로
		System.out.println(pai.getName() + "의 체력 " + pai.getHp());
		
		
		
		
		
		
		
		
	}
}
