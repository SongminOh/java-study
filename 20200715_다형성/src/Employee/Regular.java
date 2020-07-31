package Employee;

public class Regular extends Employee {

	//정규직 클래스
	
	private int bonus;	//정규직 계산을 위해서는 bonus 필요
	
	public Regular(String num, String name, int money, int bonus) {
		super(num, name, money);
		this.bonus = bonus;
	}

	@Override
	public double getPay() {
		// (연봉 + 보너스) / 12
		double result = (money + bonus) / 12 ;
		return result;
	}

}
