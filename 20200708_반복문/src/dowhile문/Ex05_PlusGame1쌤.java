package dowhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex05_PlusGame1쌤 {

	public static void main(String[] args) {

		//사용자 입력 도구
		Scanner sc = new Scanner(System.in);
//		//입력받는 기능?
//		int num = sc.nextInt();
		
		//랜덤한 수 (==난수)를 뽑아주는 도구
		Random ran = new Random();
		
		System.out.println("====Plus Game====");
		
		String isContinue = "Y";
		do {
			//실제 랜덤한 수를 뽑는 기능
			//nextInt(범위)
			int ranNum1 = ran.nextInt(10) + 1;	// 0~9  ---> 1~10
			int ranNum2 = ran.nextInt(10) + 1;	// 0~9  ---> 1~10
			System.out.print(ranNum1+"+"+ranNum2+"=");
			int input = sc.nextInt();
			
			if(ranNum1+ranNum2==input) {
				System.out.println("Success");
			} else {
				System.out.println("Fail");
				System.out.println("계속하시겠습니까?(Y/N)>>");
				isContinue = sc.next();
			}
		} while(isContinue.equals("Y") || isContinue.equals("y"));
		
		System.out.println("프로그램이 종료되었습니다.");	
	}

}
