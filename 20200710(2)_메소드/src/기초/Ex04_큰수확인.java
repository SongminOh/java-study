package ����;

public class Ex04_ū��Ȯ�� {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 24;
		int result = largerNumbers(num1, num2);
		System.out.println("ū �� Ȯ�� : " + result);
	}
	//Ÿ �޼ҵ� ��, Ŭ���� ��
	//���������� static ����Ÿ�� �޼ҵ��̸�(�Ű�����)
	public static int largerNumbers(int num1, int num2) {
		//�� ū���� �������� ã�ƾ���!
//		int result = num1 > num2 ? num1 : num2;		�� �� ������쿡�� num2��µ�
		int result = 0;		//�߰�ȣ �ȿ����� �� �ȿ����� �� �� �ֱ� ������ if�� �ۿ��� ����
		if (num1 > num2) {
			result = num1;				//����result������ϰ� return num1;
		} else if (num1 < num2) {
			result = num2;				//return num2;
		} else {
			result = 0;					//return 0;
		}
		return result; //return�� ������ �޼ҵ�� �����! �ܼ� result����̾ƴ� ���� �� ���� ����!
	}




}
