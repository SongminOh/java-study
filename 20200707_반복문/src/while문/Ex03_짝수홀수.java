package while문;

import java.util.Scanner;

public class Ex03_짝수홀수 {

	public static void main(String[] args) {
		// 1. 숫자입력
		// 2. 짝수인지 홀수인지 판별
		// 3. 짝수개수와 홀수개수를 누적!
		// 4. 출력을 합니다!
		// 5. 1~4 를 반복합니다. 단, -1을 입력하면 종료
		
		Scanner sc = new Scanner(System.in);

		int even = 0;
		int odd = 0;

		while (true) {
			System.out.print("숫자입력: ");
			int input = sc.nextInt();	//실제로 입력받는 부분
			// 짝수와 홀수를 판별!
			if (input == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
			if (input % 2 == 0) { //else if 로 위의if문과 묶어서 써도 됨.
				//짝수
				even += 1;			    // even++    <<이와같이 써도 됨
			} else {
				//홀수
				odd += 1;		     	// odd++
			}
			System.out.println("짝수개수: " + even);
			System.out.println("홀수개수: " + odd);
		}
	}

}
