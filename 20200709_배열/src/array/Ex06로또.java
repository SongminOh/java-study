package array;

import java.util.Random;

public class Ex06�ζ� {
	public static void main(String[] args) {
		Random ran = new Random(); // ������ ����
		int[] arr = new int[5]; // 5ĭ¥�� ������ �迭 �̸�? arr

		System.out.println("====�ζ�Ÿ��====");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(10) + 1; // 1~10���� ������ ���� �����ؼ� �迭�� �������
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}

		}

		System.out.println("�̹��� ��¹�ȣ�¿�...!! �α��α��α�!!!!");
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
