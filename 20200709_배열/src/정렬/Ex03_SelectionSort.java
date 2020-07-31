package 정렬;

import java.util.Arrays;

public class Ex03_SelectionSort {

	public static void main(String[] args) {
		// 정수형 배열 선언
		int[] arr = { 78, 44, 95, 3, 12 };

		// 1. 배열에서 가장 큰 값을 찾아주세요!
		// 2. 가장 큰 값과 0번째 방을 서로 치환해주세요!
		// max에 값 자체를 넣어버리면 (치환개념 못씀)(위치가 어딘지 모르기 때문), 그래서 max -> 인덱스 번호 기억하게 선언.

		// 가장 큰값이 있는 인덱스를 저장할 임의의 변수
		for (int j = 0; j < arr.length; j++) {
			int max = j;
			for (int i = j; i < arr.length; i++) { // 번지수는 0번부터 시작하니 길이보다 < 작은값까지만!
				if (arr[max] < arr[i]) {
					max = i; // 최대값이 있는 인덱스 번호를 찾음
				}
			} //내부 for문: 최대값이 있는 인덱스를 찾는 코드
			
			int temp = arr[j]; // arr[j]방에 있는 걸 temp 안전하게 보관 . 치환중
			arr[j] = arr[max];
			arr[max] = temp;
		}
		
		System.out.println(Arrays.toString(arr));

		
		
//		for (int j = 0; j < arr.length - 1; j++) {
//			for (int i = j + 1; i < arr.length; i++) {
//				if (arr[j] < arr[i]) {		//왼쪽값이 더 작으면
//					int temp = 0;
//					temp = arr[i];			//큰값을 임의의변수에
//					arr[i] = arr[j];		//작은값을 오른쪽으로
//					arr[j] = temp;			//임의의변수에들어있는 큰값을 왼쪽으로 보내줌!
//				}
//			}
//
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

	}

}
