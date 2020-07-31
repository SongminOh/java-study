package 오버라이딩;

public class AX extends Weapon {

	@Override
	public void attack() {
		System.out.println("도끼로 공격");
	}

	@Override
	public void stab() {
		System.out.println("도끼로 찌르기");
	}
	
}
