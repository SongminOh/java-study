package Shape;

public abstract class Shape {

	double width;
	double height;
	double radius;
	final double pie = 3.14;
	
	//넓이 구하는 메소드
	public abstract double cal();
	
	
	public Shape(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Shape(double width) {//매개변수는 반지름
		this.width = width;
	}
	
	
}
