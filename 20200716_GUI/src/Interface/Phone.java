package Interface;

public interface Phone extends Camera {
	//�������̽��� Ư¡
	//1.(interface���ο���) �߻�޼ҵ常 ���簡��
	//	 �߻�޼ҵ�: ����Ŭ������ "������"�ϰԲ�(����) ���� �޼ҵ�
	//2.���� ���� �Ұ�
	//3.�������̽��� ��� Ȯ��� extends Ű���� ���
	//4.Ȯ��� ��� ���� X
	
	//jdk 1.7���������� ����� �����߽��ϴ�.
	//�߻�޼ҵ常 ����
	int num = 10;
	
	//abstract ����! (public ����)
	public void call();
	
	//========================================================================���� TIP
	//jdk1.8�������� default �޼ҵ� ���� ����
	default void receive() {
		System.out.println("��ȭ �ޱ�");
	}

	//jdk1.9�������� private�޼ҵ� ���� ����
//	private void msn() {
//		System.out.println("hello");
//	}
	
	
	
	
	
	
	
	
}
