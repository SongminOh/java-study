package Employee;

import java.util.ArrayList;

public class Em_main {
	public static void main(String[] args) {
		
		//��ü ���� 
		//Ŭ������ ������ = new Ŭ������(�ű⺯��);
//		Alba hyunjin = new Alba("E003", "������", 5, 10);
//		double pay = hyunjin.getPay();
//		System.out.println();
//		
//		
//		Regular ��� = new Regular("E002", "����", 3000, 400);
//		double pay2 = ���.getPay();
//		
//		System.out.println(���.num + ". " + ���.name + "���� �̹��� �޿���" + pay2 + "���� �Դϴ�.");
//		System.out.println(pay);
		
		
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		//�����ȣ, �̸�, ����, �Ⱓ
		list.add(new Contract("E001", "�ڿ�ȣ", 3000, 6));
		list.add(new Regular("E002", "����", 3000, 400));
		list.add(new Alba("E003", "������", 5, 10));
		list.add(new Alba("E004", "������", 10, 20));
		
		//�츮�� ������ ������� list��� ���� ���� �������
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).num + ". " + list.get(i).name + "���� �̹��� �޿���" + list.get(i).getPay()+"���� �Դϴ�.");
		}
		
		
		
		
		
		
		
	}
}
