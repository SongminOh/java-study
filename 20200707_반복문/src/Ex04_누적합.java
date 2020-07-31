import java.util.Scanner;

public class Ex04_누적합 {

	public static void main(String[] args) {
		// 숫자 두개를 입력받습니다. (5, 10) or (10, 5)
		//  5부터 10까지의 총합을 알려줍니다. 총합 : 45
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		//num1에는 큰 수
		//num2에는 작은 수
		// 1step. 작은 수 큰 수 판별해서 다시 변수에 담기
		if (num1 < num2 ) {
			// 치환
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
				
		// 2step. 작은 수 부터 큰 수 까지 출력
		// 3step. 작은 수 부터 큰 수 까지의 합 누적
		int sum = 0;  //for문 안에 만들면 계속 sum이 초기화 됨
		
		for(int i = num2; i <= num1; i++) {
			//System.out.println(i);
			sum += i;
		}
		
		// 4step. 누적한 값 출력하기
		System.out.println("누적합: " + sum);
	}

}
