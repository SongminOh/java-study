package com.Student;

public class Student_main {
	public static void main(String[] args) {

		//�ϳ��� ���赵�� 2���� "��ü" ����
		//���赵�� �̸� | {}�ȿ��� ����� �̸� = new(��ü���� Ű����) |���赵�� �̸�();
		Student student1 = new Student("�趯��", 20, "20200518");	//student1�̶�� ��ü ������
		
		//�̸�, ����, �й� �ʱ�ȭ or �ƹ��͵� ���� �Ʊ�ó�� () ������ �ǰ� ����� �;��!
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(student1.getNumber());
		
		System.out.println("==================================");
		
//		student1.show();	//null�� ��µ�
	
		//��ȸ�ؼ� ���� �־���� ��!
		//setter
//		student1.name = "����";				//�ʵ忡 ���������� �����Ͽ� ���� ������
//		student1.number = "20200878";
//		student1.age = 20;
//		student1.scoreJava = 50;
//		student1.scoreWeb = 99;
//		student1.scoreAndroid = 77;
		student1.setName("����");			//��ɻ���Ͽ� ��ȸ�Ͽ� ���� �־���
		student1.setNumber("20200878");
		student1.setAge(20);
		student1.setScoreJava(50);
		student1.setScoreWeb(99);
		student1.setScoreAndroid(77);
		student1.show();
		
		System.out.println("==================================");

		Student student2 = new Student();	//student2��� ��ü ������
//		student2.name = "�����";
//		student2.number = "20200458";
//		student2.age = 20;
//		student2.scoreJava = 90;
//		student2.scoreWeb = 25;
//		student2.scoreAndroid = 50;
		System.out.println(student2.getScoreJava());	//�� ���� ���̱⿡ int�� �⺻�� 0�� ��µ�
		System.out.println(student2.getName());			//String�� �⺻�� null
		student2.setName("�����");
		student2.setNumber("20200458");
		student2.setAge(20);
		student2.setScoreJava(90);
		student2.setScoreWeb(25);
		student2.setScoreAndroid(50);
		student2.show();
				
		System.out.println("==================================");
		
		//student2��ü�� ������ �ִ� �ڹ������� ����ʹٸ�?
		System.out.println(student2.getScoreJava());
	
	
	}
}
