package ����;

public class Ex06_����Ǵ� {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);

		System.out.println(divisor);
		System.out.println(getSum(7));
		// 10�� ��� -> 1,2,5,10
		// 15�� ��� -> 1,3,5,15
		// 20�� ��� -> 1,2,4,5,10,20 --> �ڱ��ڽ��� ������ ��� �ڱ��ڽ�/2
		// �ڱ��ڽ��� ������ ����� �ڱ��ڽ�/2���� ����!!!!! Ŭ ���� ���� !!!!!
		System.out.println(isPerfect(6));
	}

	public static boolean isDivisor(int num1, int num2) {

		boolean result = false;
		// ����� �Ǻ� ---> � ���� �������� �� �������� 0�� ��!
		if (num1 % num2 == 0) {
			result = true;
		} else {
			result = false;
		}
		// return num1 % num2 ==0 ? true : false;

		return result;

	}

	// getSum�̶�� �޼ҵ带 ����! ����Ÿ���� int��! �Ű������� 1��!
	private static int getSum(int num) {
		// i�� ��� ���ϱ�. ����? i���� Ŭ �� ����
		int sum = 0;

		// Arthimetic Exception -> 0���� ������ �� ������ ����
		for (int i = 1; i <= num / 2; i++) {
			// �ݺ��� ���鼭 ������� ã�ƾ���!
			if (num % i == 0) {
				// ������ ����! ���� ������ ���Ѿ� ��!
				sum += i; // sum = sum+i;
			}
		}
		return sum;
	}

	public static boolean isPerfect(int num) {

		boolean result = false;
		// 1. �Ű������� ���� i�� ������� ���ϱ�!
		// 2. ������� ���� ���ϱ�!
		// 3. i�� ������� ���� ������ ���ϱ�!
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
