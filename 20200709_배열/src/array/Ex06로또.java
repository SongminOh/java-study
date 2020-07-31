package array;

import java.util.Random;

public class Ex06로또 {
	public static void main(String[] args) {
		Random ran = new Random(); // 난수를 생성
		int[] arr = new int[5]; // 5칸짜리 정수형 배열 이름? arr

		System.out.println("====로또타임====");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(10) + 1; // 1~10까지 랜덤한 수를 생성해서 배열에 집어넣음
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}

		}

		System.out.println("이번주 출력번호는요...!! 두구두구두구!!!!");
		for (int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
//			try {
//				Tread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		
		
	}
}
