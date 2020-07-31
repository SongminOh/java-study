package Shape;

public class Shape_tri extends Shape{
	
	public Shape_tri(double width, double height) {
		super(width, height);
	}

	@Override
	public double cal() { 	//삼각형의 넓이를 구해주는 메소드
		double result = width * height / 2;
		return result;
	
	}

}
