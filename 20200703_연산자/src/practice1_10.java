import java.util.Scanner;

public class practice1_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);      // sc +ctrl+space <=자동완성
		System.out.print("Java 점수 입력 : ");
		int javaScore = sc.nextInt();
		System.out.print("Web 점수 입력 : ");
		int webScore = sc.nextInt();              // ne +ctrl+space <=자동완성
		System.out.print("Android 점수 입력 : ");
		int androidScore = sc.nextInt();
		
		//변수명도 자동완성 됨
		int sum = javaScore + webScore + androidScore;
		int avg = sum / 3;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
