package ����;

public class Ex01 {
	public static void main(String[] args) {
		//void -> ����Ÿ���� ����!
		//JVM -> java virtual machine
	
		//�޼ҵ�� �̸��� �ҷ��ָ� ��
		int result = addNum(4,17);
		System.out.println(result);
	}
	
	//�޼ҵ� ������ �� ���� main �ۿ�! ��, class�ȿ�!
	public static int addNum (int num1, int num2) {
//1.���������� 2.������� 3.����Ÿ�� 4.�޼ҵ��̸� 5.()�Ű�����,Parameter 	
		int result = num1 + num2;
		return result; //������ ������ �޼ҵ�� ����!
		//������ �� �ѹ�, �ϳ��� ���� ���� (per method)
	}
	
}
