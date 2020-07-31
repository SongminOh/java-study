import java.util.Scanner;

public class Ex08조건문_switch실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		
		//조건문switch-case
		//딱 떨어지는 값
		switch (totalScore/10) {
		case 10 :
		case 9 :
			System.out.println("A학점입니다!");
			break;
		case 8 :
			System.out.println("B학점입니다!");
			break;
		case 7 :
			System.out.println("C학점입니다!");
			break;
		default :
			System.out.println("D학점입니다!");
			break;
		}
	}
}
