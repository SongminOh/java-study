import java.util.Scanner;

public class Ex05조건문_마트계산대 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사려는 상품 갯수를 입력하세요");
		int cnt = sc.nextInt();
		
		//if (cnt>=11) {
		//	System.out.println("가격은 " + Math.round(cnt*10000*0.9) + "원 입니다" );
		//} else {
		//	System.out.println("가격은 " + (cnt*10000) + "원 입니다");
		//}
		
		if (cnt>=11) {
			double pay = cnt * 10000 * 0.9;
			int i = (int)pay;
			System.out.println("가격은 " + i + "원 입니다");
		} else {
			System.out.println("가격은 " + (cnt*10000) + "원 입니다");
		}
	}
}
