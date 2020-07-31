package ����;

import java.util.Arrays;

public class Ex03_SelectionSort {

	public static void main(String[] args) {
		// ������ �迭 ����
		int[] arr = { 78, 44, 95, 3, 12 };

		// 1. �迭���� ���� ū ���� ã���ּ���!
		// 2. ���� ū ���� 0��° ���� ���� ġȯ���ּ���!
		// max�� �� ��ü�� �־������ (ġȯ���� ����)(��ġ�� ����� �𸣱� ����), �׷��� max -> �ε��� ��ȣ ����ϰ� ����.

		// ���� ū���� �ִ� �ε����� ������ ������ ����
		for (int j = 0; j < arr.length; j++) {
			int max = j;
			for (int i = j; i < arr.length; i++) { // �������� 0������ �����ϴ� ���̺��� < ������������!
				if (arr[max] < arr[i]) {
					max = i; // �ִ밪�� �ִ� �ε��� ��ȣ�� ã��
				}
			} //���� for��: �ִ밪�� �ִ� �ε����� ã�� �ڵ�
			
			int temp = arr[j]; // arr[j]�濡 �ִ� �� temp �����ϰ� ���� . ġȯ��
			arr[j] = arr[max];
			arr[max] = temp;
		}
		
		System.out.println(Arrays.toString(arr));

		
		
//		for (int j = 0; j < arr.length - 1; j++) {
//			for (int i = j + 1; i < arr.length; i++) {
//				if (arr[j] < arr[i]) {		//���ʰ��� �� ������
//					int temp = 0;
//					temp = arr[i];			//ū���� �����Ǻ�����
//					arr[i] = arr[j];		//�������� ����������
//					arr[j] = temp;			//�����Ǻ���������ִ� ū���� �������� ������!
//				}
//			}
//
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

	}

}
