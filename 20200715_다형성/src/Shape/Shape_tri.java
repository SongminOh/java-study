package Shape;

public class Shape_tri extends Shape{
	
	public Shape_tri(double width, double height) {
		super(width, height);
	}

	@Override
	public double cal() { 	//�ﰢ���� ���̸� �����ִ� �޼ҵ�
		double result = width * height / 2;
		return result;
	
	}

}
