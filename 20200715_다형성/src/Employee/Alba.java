package Employee;

public class Alba extends Employee {

	int day;
	
	
	public Alba(String num, String name, int money, int day) {
		super(num, name, money);
		this.day = day;
	}

	@Override
	public double getPay() {
		return money*day;
	}

}
