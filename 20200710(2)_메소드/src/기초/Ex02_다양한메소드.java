package ����;

public class Ex02_�پ��Ѹ޼ҵ� {

	public static void main(String[] args) {

		//�޼ҵ带 ����Ϸ���? �޼ҵ��� �̸��� �ҷ���!
		printHi();
		System.out.println(printNum());
		printNum2(4,10);
	}
	//����Ÿ��X, �Ű�����X -> �� �޼ҵ��� �̸��� printHi
	public static void printHi() {
		System.out.println("��ȭ���ؼ� �̾��ؿ�.....�ָ�..");
	}
	//����Ÿ��O, �Ű�����X
	public static int printNum() {
		return 4;
	}
	//����Ÿ��X, �Ű�����O
	public static void printNum2(int num1, int num2) {
		System.out.println(num1*num2);
	}
}
