package Employee;

public class Contract extends Employee {

	//����� Ŭ����
	
	private int term;
	
	public Contract(String num, String name, int money,int term) {
		super(num, name, money);
		this.term = term;
	}

	
	@Override
	public double getPay() {
		// ����/���Ⱓ
		double result = money / term;
		return result;
	}
	
	
	
}
