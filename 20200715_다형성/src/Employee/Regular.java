package Employee;

public class Regular extends Employee {

	//������ Ŭ����
	
	private int bonus;	//������ ����� ���ؼ��� bonus �ʿ�
	
	public Regular(String num, String name, int money, int bonus) {
		super(num, name, money);
		this.bonus = bonus;
	}

	@Override
	public double getPay() {
		// (���� + ���ʽ�) / 12
		double result = (money + bonus) / 12 ;
		return result;
	}

}
