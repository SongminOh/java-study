package Interface;

public class SmartPhone implements Phone, Internet {
	//���: extends   �������̽� �����ϴ�,�����޾Ҵ�: implements
	//�߻�"Ŭ����" => ���߻�� ���� �ȵ�
	//��Ӱ� ������ ���ÿ� �����ϴ�
	
	@Override
	public void call() {
		System.out.println("����Ʈ�� ��ȭ�ޱ�");
	}

	@Override
	public void pick() {
		System.out.println("�ʱ��� ������� ��Ĭ!");
	}

	@Override
	public void internet() {
		// TODO Auto-generated method stub
		
	}	

	
	
}
