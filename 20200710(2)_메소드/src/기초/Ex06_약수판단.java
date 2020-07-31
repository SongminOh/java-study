package 기초;

public class Ex06_약수판단 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);

		System.out.println(divisor);
		System.out.println(getSum(7));
		// 10의 약수 -> 1,2,5,10
		// 15의 약수 -> 1,3,5,15
		// 20의 약수 -> 1,2,4,5,10,20 --> 자기자신을 제외한 약수 자기자신/2
		// 자기자신을 제외한 약수는 자기자신/2보다 절대!!!!! 클 수가 없음 !!!!!
		System.out.println(isPerfect(6));
	}

	public static boolean isDivisor(int num1, int num2) {

		boolean result = false;
		// 약수를 판별 ---> 어떤 수를 나누었을 때 나머지가 0인 수!
		if (num1 % num2 == 0) {
			result = true;
		} else {
			result = false;
		}
		// return num1 % num2 ==0 ? true : false;

		return result;

	}

	// getSum이라는 메소드를 만듦! 리턴타입은 int형! 매개변수는 1개!
	private static int getSum(int num) {
		// i의 약수 구하기. 범위? i보다 클 수 없음
		int sum = 0;

		// Arthimetic Exception -> 0으로 나눴을 때 나오는 에러
		for (int i = 1; i <= num / 2; i++) {
			// 반복문 돌면서 약수들을 찾아야함!
			if (num % i == 0) {
				// 약수라는 뜻임! 합의 누적을 시켜야 함!
				sum += i; // sum = sum+i;
			}
		}
		return sum;
	}

	public static boolean isPerfect(int num) {

		boolean result = false;
		// 1. 매개변수로 들어온 i의 약수부터 구하기!
		// 2. 약수들의 합을 구하기!
		// 3. i랑 약수들의 합이 같은지 비교하기!
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}

}
