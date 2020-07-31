package Shape;

public class Shape_cir extends Shape{

	public Shape_cir (double radius) {
		super(radius);
	}

//	//1¹ø¹æ¹ý
//	public Shape_cir(double width, double height) {
//		super(width, height);
//	}
	
	@Override
	public double cal() {
		// Math.pow(radius, 2) * pie
		return radius*radius*pie;
	}


}


