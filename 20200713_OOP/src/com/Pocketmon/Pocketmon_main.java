package com.Pocketmon;

public class Pocketmon_main {
	public static void main(String[] args) {
		
		
		//1.Pocketmon���赵�� ������� 2���� ���ϸ� �����
		//2.pickachu ��ü ����, paili ��ü ����
		
		//pickachu -> �̸�:��ī��, ����:1000, Ÿ��:����, ���ݷ�:200, ü��:1500, ���:�鸸��Ʈ
		//paili -> �̸�:���̸�, ����:500, Ÿ��:��, ���ݷ�:100, ü��:1000, ���:�Ҳɼ���
		Pocketmon pika = new Pocketmon("����", "�鸸��Ʈ", 1000, 1500, "��ī��", 200); 
		Pocketmon pai = new Pocketmon("��", "�Ҳɼ���", 500, 1000, "���̸�", 100);
		
		
//		pika.getHp();	//���������°�
//		pai.setHp(2000);//�� �缳���ϴ°�

		Pocketmon[] po_array = new Pocketmon[5];
		po_array[0] = pika;
		po_array[1] = pai;
		
		
		
		System.out.println(pika.getName() + "�� ����! " + pika.getSkill()+"���");
//		System.out.println(pai.getHp() - pika.getAttack());	//1000-200 (�ܼ����)
		pai.setHp(pai.getHp() - pika.getAttack());	//���� ��800���� �ٲ��� <<����>>
//		System.out.println(pai.getHp());	//(�ٲ�)<<�� ��������>> getter��
		System.out.println(pai.getName() + "�� ü�� " + pai.getHp());
		
		
		
		
		
		
		
		
	}
}
