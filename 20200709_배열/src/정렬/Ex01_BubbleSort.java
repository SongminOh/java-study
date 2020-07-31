package 정렬;

import java.util.Arrays;

public class Ex01_BubbleSort {

	public static void main(String[] args) {

		// 정수형 배열 생성
		int[] arr = { 7, 45, 12, 82, 25 }; // 배열의 크기는? 5칸! 방번호(index)는? 4까지!

		// 버블정렬
		// 1. 0번방 1번방, 1번방 2번방, 2번방 3번방, 3번방 4번방 --> 비교 코드!
		// 2. 더 큰수를 오른쪽으로 보내주세요.
		// arr[0] = arr[1]
		// arr[1] = arr[0]
		// 서로의 값을 바꾸려면? 치환! 변수가 필요함!

		for (int j = 1; j < arr.length; j++) {

			for (int i = 0; i < arr.length - j; i++) {
				System.out.println(Arrays.toString(arr)); // 한번에 배열을 출력하는 기능
				// 1씩 증가하는 변수의 이름은 == i
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1]; // int temp = 0; 선언및초기화 후 temp=..해도됨
					arr[i + 1] = arr[i];
					arr[i] = temp;
					//System.out.println(Arrays.toString(arr)); // 한번에 배열을 출력하는 기능
				}
			}
		}
//		System.out.println(Arrays.toString(arr)); // 한번에 배열을 출력하는 기능

	}

}
