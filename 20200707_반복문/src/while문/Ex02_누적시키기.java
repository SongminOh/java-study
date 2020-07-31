package while문;

import java.util.Scanner;

public class Ex02_누적시키기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 숫자를 입력
		//2. 입력받은 숫자를 누적해서 출력
		//3. 1~2를 반복하는데, 단 -1을 입력하면 종료하는 프로그램
		
		int sum = 0;		//초기화  : 최초의 값을 한 번 할당해 주는 것
				
		while (true) {
			System.out.print("숫자 입력: ");
			int input = sc.nextInt();
			sum += input;
			System.out.println("누적결과: " + sum);
			if (input == -1) {
				System.out.println("종료되었습니다.");
				break;	// 반복문을 멈추는 키워드
			}
			
		}
		
	}

}
