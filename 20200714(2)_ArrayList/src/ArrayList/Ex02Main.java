package ArrayList;

import java.util.ArrayList;

public class Ex02Main {

	public static void main(String[] args) {

		//Student�� �ϳ��� ��� ������ �� �ִ� ArrayList�� ����
		ArrayList<Student> list = new ArrayList<Student>();
		
		//1.����Ʈ�� ���� �־��ְڴ�.
		list.add(new Student("����", 20));
		list.add(new Student("���Ѻ�", 25));
		list.add(new Student("�̿���", 19));
		
		System.out.println(list.size());
		
		//2.ù��° �ε����� �ִ� ������ �̸��� ���
		System.out.println(list.get(0).getName());
		//Student s = list.get(0);
		//System.out.printly(s.getName());
	}

}
