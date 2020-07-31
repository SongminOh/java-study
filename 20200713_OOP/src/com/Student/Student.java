package com.Student;

public class Student {

	//���������� -> private, default, protectd, public
	
	// �ʵ带 ������ ���� �ڷ��� ������; �̷��� "Ʋ��" ���ֽø� �˴ϴ�.
	//�̸�, ����, �й�, �ڹ�����, ������, �ȵ���̵� ����
	//=============================�ʵ�, �Ӽ�, ����====================================//
	private String name;
	private String number;
	private int age; 
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	
	
	//===============================���, ����=======================================//
	
	//������ �����
	//������? new Ű���� ���ؼ�, ��ü�� ���� �� ���� �ʱ�ȭ
	//1.�����ڵ� �޼ҵ�!
	//2.�����ڴ� Ŭ����(=���赵)�� �̸��� ���ƾ� ��
	//3.�����ڴ� ����Ÿ���� ������ ��  ����
	public Student(String name, int age, String number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}
	
	public Student() {
	}
	
	//�̸�,����,�й� or �ƹ��͵� ���� ���� or ��� ���� �ʱ⿡ �� �޴� ������
	public Student(String name, int age, String number, int scoreJava, int scoreWeb, int socreAndroid) {
		//�ʵ�(�Ӽ�)�� �ִ� ���� �Ű������� �޾ƿ� ������ ����
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	
	//�޼ҵ带 ������ �̸����� �ߺ����� �� �� ����
	//����: "�Ű�����"�� ����, �ڷ����� �޶�� ��. 
	//�޼ҵ� �����ε�(overloading) == �ߺ�����
	
	
	
	
	//�ʵ忡 ���� �־��� �� �ִ� �޼ҵ��
	public void setName(String name) {
		this.name = name; //{} �Ű������� �޾ƿ� �ָ� �켱������ ��.
		//���� �ִ� �ʵ�(=�Ӽ�=����)�� ��Ī�ϴ� Ű���� == this
	}
	//����, �й�, �ڹ�����, ������, �ȵ���̵������� �־��� �� �ִ� �޼ҵ� �����ϱ�.
	//���� �־��� �� �ִ� �޼ҵ���� ���� ���� set�ʵ��̸�
	public void setNumber(String number) {
		this.number = number;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}
	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
	
	//������ �ʵ带 ������ ���� �޼ҵ� �����
	//getter �޼ҵ�
	public String getName() {
		return name;			//�Ű����� ���⶧���� this. Ű���� �Ƚᵵ ��
	}
	public String getNumber() {
		return number;
	}
	public int getAge() {
		return age;
	}
	public int getScoreJava() {
		return scoreJava;
	}
	public int getScoreWeb() {
		return scoreWeb;
	}
	public int getScoreAndroid() {
		return scoreAndroid;
	}

	
	public void show() {
		System.out.println(name + "�� �ȳ��ϼ���.\n" 
				+ "[ " + number + " , " + age + "�� ]\n"
				+ name + "���� Java������" + scoreJava + "�� �Դϴ�.\n"
				+ name + "���� Web������" + scoreWeb + "�� �Դϴ�.\n"
				+ name + "���� Android������" + scoreAndroid + "�� �Դϴ�.");
	}
	
	
	
}
