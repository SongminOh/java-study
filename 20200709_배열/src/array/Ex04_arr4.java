package array;

import java.util.Scanner;

public class Ex04_arr4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score[] = new int[5];
		// int a = 1;
		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "��° �Է�>> "); // a++ + ".. �� ����
			int num = sc.nextInt();
			score[i] = num;
		}
		System.out.print("�Է��� ���� : ");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}

System.out.println();

		int max = score[0]; // �ְ����������� ����	�ʱ갪�� 0���� ����[0]�� �� ȿ����
		int min = score[0]; // �������� ������ ����
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("�ְ� ���� : " + max);
		System.out.println("���� ���� : " + min);
		
		
		//�����̶� ��� ���ϴ� �ڵ�
		
		int sum = 0;
		for (int i = 0;  i < score.length; i++) {
			sum += score[i];
			//sum = sum + score[i]
		}
		System.out.println("���� : " + sum);
		System.out.println("��� : " + sum / score.length);
		
		
//		����Ÿ���� ���������� �ϳ��� ������ = "�迭"
//		�ε����� ���� ����. 0�������� ����
	}

}
