import java.util.Scanner;

public class Ex04조건문_정처기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int db = sc.nextInt();
		System.out.print("전자계산기 구조 : ");
		int 전자계산기구조 = sc.nextInt();
		System.out.print("OS : ");
		int os = sc.nextInt();
		System.out.print("데이터통신 : ");
		int 데이터통신 = sc.nextInt();
		System.out.print("소프트웨어공학 : ");
		int 소프트웨어공학 = sc.nextInt();
		
		int total = db + 전자계산기구조 + os + 데이터통신 + 소프트웨어공학;
		/* 불합격할 조건 -> 5개의 과목 중 하나라도 8개 미만인 경우, 총합이 60개 미만인 경우
		if ( DB<8 || 전자계산기구조<8 || OS<8 || 데이터통신<8 || 소프트웨어공학<8 || total<60 )
		  	System.out.println("불합격입니다!");
		 else
		    System.out.println("합격입니다!");
		 */
		
		if ( (! ((db>=8)&&(전자계산기구조>=8)&&(os>=8)&&(데이터통신>=8)&&(소프트웨어공학>=8)) ) || (total < 60) ) {
			System.out.println("불합격입니다!");
		} else if (total >= 60) {
			System.out.println("합격입니다!");
		}
	}
}
