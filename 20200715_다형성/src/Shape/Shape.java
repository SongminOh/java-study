package Shape;

public abstract class Shape {

	double width;
	double height;
	double radius;
	final double pie = 3.14;
	
	//���� ���ϴ� �޼ҵ�
	public abstract double cal();
	
	
	public Shape(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Shape(double width) {//�Ű������� ������
		this.width = width;
	}
	
	
}
