package Employee;

public abstract class Employee {		//�ܼ��ϰ� Ʋ�� �������ִ� �߻�Ŭ����
	
	//�ʵ忡 �������� ���� �Ӽ�
	String num;
	String name;
	int money;
	
	
	//������
	public Employee(String num, String name, int money) {
		super();
		this.num = num;
		this.name = name;
		this.money = money;
	}
	
	public abstract double getPay(); //������, �����, �Ƹ�����Ʈ�Ŀ� ���� --> (�������̵�)_������
		
	
	
	
}
