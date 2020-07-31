package 오버라이딩;

public class Sword extends Weapon {

	public void attack() {
		System.out.println("검으로 공격");
	}
	
	public void stab() {
		System.out.println("검으로 찌르기");
	}
}
