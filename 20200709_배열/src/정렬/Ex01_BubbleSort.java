package ����;

import java.util.Arrays;

public class Ex01_BubbleSort {

	public static void main(String[] args) {

		// ������ �迭 ����
		int[] arr = { 7, 45, 12, 82, 25 }; // �迭�� ũ���? 5ĭ! ���ȣ(index)��? 4����!

		// ��������
		// 1. 0���� 1����, 1���� 2����, 2���� 3����, 3���� 4���� --> �� �ڵ�!
		// 2. �� ū���� ���������� �����ּ���.
		// arr[0] = arr[1]
		// arr[1] = arr[0]
		// ������ ���� �ٲٷ���? ġȯ! ������ �ʿ���!

		for (int j = 1; j < arr.length; j++) {

			for (int i = 0; i < arr.length - j; i++) {
				System.out.println(Arrays.toString(arr)); // �ѹ��� �迭�� ����ϴ� ���
				// 1�� �����ϴ� ������ �̸��� == i
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1]; // int temp = 0; ������ʱ�ȭ �� temp=..�ص���
					arr[i + 1] = arr[i];
					arr[i] = temp;
					//System.out.println(Arrays.toString(arr)); // �ѹ��� �迭�� ����ϴ� ���
				}
			}
		}
//		System.out.println(Arrays.toString(arr)); // �ѹ��� �迭�� ����ϴ� ���

	}

}
