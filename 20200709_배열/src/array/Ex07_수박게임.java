package array;

import java.util.Scanner;

public class Ex07_���ڰ��� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//������ �迭 ����
		String[] arr = { "��", "��" };	//2ĭ¥��! ���ȣ :0,1 

		System.out.print("���ڸ� �Է����ּ���>>");
		int input = sc.nextInt(); //�Է¹޴� ����

		//7 -> ���ڼ��ڼ��ڼ�
		//1 -> ��
		//2 -> ����
		
		for (int i = 1; i <= input; i++) {
			if(i%2==1) {
				System.out.print(arr[0]);
			} else {
				System.out.print([1]);
			}
		}
		
		
	}

}
