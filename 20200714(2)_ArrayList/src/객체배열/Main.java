package ��ü�迭;

public class Main {
	public static void main(String[] args) {
		
		//Student��ü�迭
		Student[] array = new Student[5];
		System.out.println(array);		//�ּ�(����)
		System.out.println(array[0]);	//null
		//array[0] -> Student -> ��üȭ��������? ����
		array[0] = new Student();
//		System.out.println(array[0]);
		for (int i = 0; i < array.length; i++) {	//���� ��üȭ(instance) ��Ű��
			array[i] = new Student();
			System.out.println(array[i]);
			array[i].getAge();
		}
	}
}
