package ArrayList;

import java.util.ArrayList;

public class ex01 {
	public static void main(String[] args) {
		
		//ArrayList����
		//String -> ���۷��� ����
		
		//String�� ���� �� �ִ� ArrayList�� ����
		ArrayList<String> list = new ArrayList<String>();	//�ڿ� <>���� ���� ����!
		
		//�츮�� �����ϴ� ������ ���� ����Ʈ�� ����
		//1.����Ʈ�� �� �߰��ϱ�!
		list.add("����");
		list.add("����");
		list.add("�Ҹ�");
		list.add("Ƽ��̼�");
		list.add("����");
		list.add("����");
		
		//2.����Ʈ�� ũ�⸦ ���� ���
		System.out.println(list.size()); 	//array.length
		list.add("��¦ ������ ����");
		System.out.println(list.size());
		
		//3.����Ʈ ���� ����� ��� ----> remove(�ε��� ��ȣ)
		list.remove(5);
		System.out.println(list.size());
		
		//4.����Ʈ ���̿� ���� �߰��ϴ� ���
		list.add(1, "�κ�");
		
		//5.����Ʈ �ε����� �����ϴ� ���
		String name = list.get(1);
		System.out.println(name);
		
		//6.����Ʈ�� �ִ� ��簪���� ��!��!��! ����� ���
		list.clear();
		System.out.println(list.size());
		
		
		
		
	}
}
