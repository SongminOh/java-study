import java.util.Scanner;

public class prcatice_삼항연산자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		/*
		String a = num + "는(은) 홀수입니다.";
		String b = num + "는(은) 짝수입니다.";
		
		
		String c = num % 2 != 0? a : b;
		System.out.println(c);
		*/
		
		//삼항연산자를 사용해서 짝수 홀수를 판별
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(num + "는(은) " + result + "입니다.");
	}
}
