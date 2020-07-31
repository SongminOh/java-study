import java.util.Scanner;

public class Ex02_for무한루프 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// for문 무한루프 방법
		for (;;) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			// 입력한 숫자가 0보다 작으면 반복을 종료
			if(num < 0) {
				//자신을 감싸고 있는 "가장 가까운 반복문"을
				// "종료"하는 키워드
				// break;
				break;
			}
		}
		
	}

}
