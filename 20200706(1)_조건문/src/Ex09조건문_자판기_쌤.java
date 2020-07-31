import java.util.Scanner;

public class Ex09조건문_자판기_쌤 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int money = sc.nextInt();
		// 금액을 입력받는 부분

		System.out.println("메뉴를 고르세요.");
		System.out.println("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원)");
		int choice = sc.nextInt();
		// menu를 선택하는 부분

		switch (choice) {
		case 1:
			money -= 700; // money = money - 700;
			break;
		case 2:
			money -= 1000; // money = money - 1000;
			break;
		case 3:
			money -= 500; // money = money - 500;
			break;
		default:
			System.out.println("잘못된 메뉴를 입력하셨어요!");
		}

		if (money > 0) {
			// 잔돈이 0원 이상일때만 출력
			System.out.println("잔돈 : " + money + "원");
			// ex) 9500원이라는 잔돈 -> 천원짜리는? 9장! 오백원짜리는? 1개!
			System.out.println("천원 : " + money/1000 + "개");
			System.out.println("오백원 : " + money % 1000 /500 + "개");
			System.out.println("백원 : " + money % 500 / 100 + "개");
			
		} else {
			// 잔돈 음수라면 돈이 부족하다고 출력!
			System.out.println("돈이 부족해요ㅠㅠㅠ돈벌어와...");
		}

		// 잔돈에서 천원짜리가 몇 장인지, 오백원짜리가 몇 개인지, 백원짜리가 몇 개인지 출력.

	}
}
