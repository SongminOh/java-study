package com.Pocketmon;

public class Pocketmon {
	
	//필드, 속성, 변수를 정의
	private String type;
	private String skill;
	private int level;
	private int hp;
	private String name;
	private int attack;
	
	
	//alt+shift+s
	//<생성자 정의>
	//리턴이 없다   ----> public Poketmon() __void도 작성하지 않음
	//클래스명과 같아야한다 -->대소문자까지 다 같아야 함.
	//new키워드 사용시 호출하는 메소드 --> 매개변수가 있다면 입력 강제 합니다
	//생성자도 메소드다 ---> 오버로딩이 가능하다.
	//생성자는 기본적으로 하나이상 선언되어야 한다. --> 미작성시 기본생성자가 컴파일시 자동 생성시킴
	
	
	
	public Pocketmon() {} 	//기본생성자(default)
	
	public Pocketmon (String type, String skill, int level, int hp, String name, int attack) {
		this.type = type;
		this.skill = skill;
		this.level = level;
		this.hp = hp;
		this.name = name;
		this.attack = attack;
	}
		
	//alt+shift+s
	//getter메소드 정의	
	public String getType() {
		return type;
	}
	public String getSkill() {
		return skill;
	}
	public int getLevel() {
		return level;
	}
	public int getHp() {
		return hp;
	}
	public String getName() {
		return name;
	}
	public int getAttack() {
		return attack;
	}
	
	
	//setter메소드 정의
	public void setType(String type) {
		this.type = type;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	
	
	
	
	
	
}
