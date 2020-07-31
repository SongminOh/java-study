import java.util.Scanner;

public class Ex13_약수구하기 {

	public static void main(String[] args) {

		//입력받은 수의 약수 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		//약수는 자기자신을 제외했을 때 자기자신보다 클 수 없음
		
		//최대 공약수 : 두개의 숫자 입력받아서 공통된 약수 구하기.
		//&& -> 가장 큰 수 -> 최대공약수
		
		System.out.print("약수 : ");
		for (int i = 1; i <= input; i++) {
			//나누어 떨어지는지 판별!
			if (input%i==0) {
				System.out.print(i+ " ");
			}
		}
	}

}
