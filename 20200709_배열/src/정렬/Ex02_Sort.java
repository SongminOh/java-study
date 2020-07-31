package 정렬;

import java.util.Arrays;

public class Ex02_Sort {
	public static void main(String[] args) {
		
		int[] arr = { 7, 45, 12, 82, 25 };
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); // 오름차순 정렬만 가능
	}
}
