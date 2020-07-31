package 오버라이딩;

public class Spear extends Weapon {

	@Override
	public void attack() {
		System.out.println("창으로 공격");
	}

	@Override
	public void stab() {
		System.out.println("창으로 찌르기");
	}
	
}
