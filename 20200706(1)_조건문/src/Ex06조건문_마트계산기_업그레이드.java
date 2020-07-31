import java.util.Scanner;

public class Ex06조건문_마트계산기_업그레이드 {

	public static void main(String[] args) {
		// 마트 계산기 업그레이드
		// 1번째 할인 프로모션
		// 		11개(셋트) 이상 구매시 선물 셋트 하나 가격의 10% 할인
		// 2번째 할인 프로모션
		// 		10개들이로 구매시 선물 셋트 하나 가격의 5% 할인
		// ex)
		// 9개 구매시 선물 하나당 10000 가격
		// 10개 구매시 선물 하나당 9500 가격		 -> 5프로 적용(10개들이 한셋트0
		// 13개 구매시 선물 하나당 9000 가격 	 -> 10프로 적용(11개이상)
		// 20개 구매시 선물 하나당 8500 가격 	 -> 15프로 적용(10배수 && 11개 이상)
		// 30개 구매시 선물 하나당 8500 가격 	 -> 15프로 적용(10배수 && 11개 이상)

		Scanner sc = new Scanner(System.in);
		int total = 0;
		int price = 10000;

		System.out.print("구매하려는 선물세트 개수 : ");
		int cnt = sc.nextInt();

		if ((cnt % 10 == 0) && (cnt == 10)) {
			total = (int) (cnt * price * 0.95);
		} else if ((cnt % 10 == 0) && (cnt > 10)) {
			total = (int) (cnt * price * 0.85);
		} else if ((cnt % 10 != 0) && (cnt < 11)) {
			total = cnt * price;
		} else if ((cnt % 10 != 0) && (cnt >= 11)) {
			total = (int) (cnt * price * 0.9);
		}
		System.out.println("지불할 금액 : " + total + "원");
	}
}
