package Shape;

public class Shape_main {
	public static void main(String[] args) {
		
		Shape_tri st = new Shape_tri(10, 2);
		System.out.println(st.cal());
		
		Shape_rec sr = new Shape_rec(50,4);
		System.out.println(sr.cal());
		
		Shape_cir sc = new Shape_cir(10);
		System.out.println(sc.cal());

		
		// 3**2 -- ���������� X
		System.out.println(Math.abs(-10));
		
		//pow(����1, ����2) ����1�� ����2��
		//eg) Math.pow(3,4) === 3�� 4��
		//������ * ������ * pie
		//	== ������ ���� * pie
		System.out.println(Math.pow(3, 2));
	
	}
		
	
}
