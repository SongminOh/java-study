import java.util.Scanner;

public class Ex04_������ {

	public static void main(String[] args) {
		// ���� �ΰ��� �Է¹޽��ϴ�. (5, 10) or (10, 5)
		//  5���� 10������ ������ �˷��ݴϴ�. ���� : 45
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		
		//num1���� ū ��
		//num2���� ���� ��
		// 1step. ���� �� ū �� �Ǻ��ؼ� �ٽ� ������ ���
		if (num1 < num2 ) {
			// ġȯ
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
				
		// 2step. ���� �� ���� ū �� ���� ���
		// 3step. ���� �� ���� ū �� ������ �� ����
		int sum = 0;  //for�� �ȿ� ����� ��� sum�� �ʱ�ȭ ��
		
		for(int i = num2; i <= num1; i++) {
			//System.out.println(i);
			sum += i;
		}
		
		// 4step. ������ �� ����ϱ�
		System.out.println("������: " + sum);
	}

}
