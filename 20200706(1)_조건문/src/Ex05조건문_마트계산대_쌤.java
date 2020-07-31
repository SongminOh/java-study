import java.util.Scanner;

public class Ex05조건문_마트계산대_쌤 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0; // 내가 지불해야하는 금액
		int price = 10000; //선물세트 한 개의 가격
		
		System.out.print("구매하려는 선물세트 개수 >> ");
		int cnt = sc.nextInt();
		// 11개 이상일 경우 선물세트 한 개의 가격을 10% 할인
		if (cnt >= 11) {
			total = (int)(cnt * price * 0.9);  //할인율 조절하며 쓰려면, 할인율을 따로 변수로 빼서 선언해두면 됨.
		} else {
			total = cnt * price;
		}
		System.out.println("지불할 금액 >> " + total);
	}

}
