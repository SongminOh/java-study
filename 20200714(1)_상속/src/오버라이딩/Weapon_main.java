package 오버라이딩;

public class Weapon_main {
	public static void main(String[] args) {
		
		Weapon w = new Weapon();
		w.attack();
		w.stab();
		System.out.println("==========");
		
		Sword sw = new Sword ();
		sw.attack();
		sw.stab();
		System.out.println("==========");
		
		AX ax = new AX();
		ax.attack();
		ax.stab();
		System.out.println("==========");
		
		Spear sp = new Spear();
		sp.attack();
		sp.stab();
		
		
		
	}
}
