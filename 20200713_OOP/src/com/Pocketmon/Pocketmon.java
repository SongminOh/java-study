package com.Pocketmon;

public class Pocketmon {
	
	//�ʵ�, �Ӽ�, ������ ����
	private String type;
	private String skill;
	private int level;
	private int hp;
	private String name;
	private int attack;
	
	
	//alt+shift+s
	//<������ ����>
	//������ ����   ----> public Poketmon() __void�� �ۼ����� ����
	//Ŭ������� ���ƾ��Ѵ� -->��ҹ��ڱ��� �� ���ƾ� ��.
	//newŰ���� ���� ȣ���ϴ� �޼ҵ� --> �Ű������� �ִٸ� �Է� ���� �մϴ�
	//�����ڵ� �޼ҵ�� ---> �����ε��� �����ϴ�.
	//�����ڴ� �⺻������ �ϳ��̻� ����Ǿ�� �Ѵ�. --> ���ۼ��� �⺻�����ڰ� �����Ͻ� �ڵ� ������Ŵ
	
	
	
	public Pocketmon() {} 	//�⺻������(default)
	
	public Pocketmon (String type, String skill, int level, int hp, String name, int attack) {
		this.type = type;
		this.skill = skill;
		this.level = level;
		this.hp = hp;
		this.name = name;
		this.attack = attack;
	}
		
	//alt+shift+s
	//getter�޼ҵ� ����	
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
	
	
	//setter�޼ҵ� ����
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
