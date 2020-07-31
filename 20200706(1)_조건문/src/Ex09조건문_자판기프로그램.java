import java.util.Scanner;

public class Ex09조건문_자판기프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money, menu, change = 0;
		int 아우터 = 700;
		int 이구동성 = 1000;
		int 에그몽 = 500;

		System.out.println("금액을 입력하세요.");
		money = sc.nextInt();

		System.out.println("메뉴를 고르세요.");
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
		menu = sc.nextInt();

		if ((menu == 1) && (money > 아우터)) {
			change = money - 아우터;
		} else if ((menu == 2) && (money > 이구동성)) {
			change = money - 이구동성;
		} else if ((menu == 3) && (money > 에그몽)) {
			change = money - 에그몽;
		} else if (money < 아우터 || money < 이구동성 || money < 에그몽) {
			change = money;                   //// 금액부족일때 잔돈이 뜨게 하기위해서는 이와같이 change변수 여기서 해줘야 함! ★★★★★
			System.out.println("금액이 부족합니다.");
		}
		//change라는 새로운 변수에 잔돈을 담아서 그렇답니다! ★★★★★
		//이렇게 풀기위해서라면~ 이렇게 해주시면 될거에용!★★★★★
		System.out.println("잔돈 : " + change + "원");
		System.out.println("천원 : " + (change / 1000) + "개");
		System.out.println("오백원: " + ((change % 1000) / 500) + "개");
		System.out.println("백원 : " + ((change % 500) / 100) + "개");
	}
}
