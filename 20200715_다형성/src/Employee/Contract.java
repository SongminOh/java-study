package Employee;

public class Contract extends Employee {

	//계약직 클래스
	
	private int term;
	
	public Contract(String num, String name, int money,int term) {
		super(num, name, money);
		this.term = term;
	}

	
	@Override
	public double getPay() {
		// 연봉/계약기간
		double result = money / term;
		return result;
	}
	
	
	
}
