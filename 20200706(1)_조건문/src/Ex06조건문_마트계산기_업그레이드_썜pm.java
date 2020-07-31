import java.util.Scanner;

public class Ex06조건문_마트계산기_업그레이드_썜pm {

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
		System.out.print("구매하려는 선물세트 개수 >> ");
		int cnt = sc.nextInt();
		int price = 10000;
		double discount = 1;  //할인되는 퍼센트에 관한 것을 누적
				
		//단순 if문사용
		if(cnt%10==0) {
			discount -= 0.05;
			//discount = discount - 0.05 ----> 0.95
		}
		
		if(cnt>=11) {
			discount -= 0.1;
			//discount = discount - 0.1 ----> 0.9
			
		System.out.println("가격은 " + (int)(price * cnt * discount) + "원 입니다.");	
		}
	}

}
