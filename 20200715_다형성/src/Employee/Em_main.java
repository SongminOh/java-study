package Employee;

import java.util.ArrayList;

public class Em_main {
	public static void main(String[] args) {
		
		//객체 생성 
		//클래스명 변수명 = new 클래스명(매기변수);
//		Alba hyunjin = new Alba("E003", "김현진", 5, 10);
//		double pay = hyunjin.getPay();
//		System.out.println();
//		
//		
//		Regular 운비 = new Regular("E002", "김운비", 3000, 400);
//		double pay2 = 운비.getPay();
//		
//		System.out.println(운비.num + ". " + 운비.name + "님의 이번달 급여는" + pay2 + "만원 입니다.");
//		System.out.println(pay);
		
		
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		//사원번호, 이름, 연봉, 기간
		list.add(new Contract("E001", "박원호", 3000, 6));
		list.add(new Regular("E002", "김운비", 3000, 400));
		list.add(new Alba("E003", "김현진", 5, 10));
		list.add(new Alba("E004", "손지영", 10, 20));
		
		//우리가 관리할 사원들은 list라는 곳에 전부 들어있음
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).num + ". " + list.get(i).name + "님의 이번달 급여는" + list.get(i).getPay()+"만원 입니다.");
		}
		
		
		
		
		
		
		
	}
}
