
public class Ex02�迭�ǽ�1_���ձ��ϱ� {
	public static void main(String[] args) {

		// 1step ���̰� 5�� ������ �迭�ȿ� ���������� 5,10,15,20,25�� ���� �־ �����Ͻÿ�
		// �迭�� �̸� array
		
//		int[]array = new int[5];
//		array[0] = 5;
//		array[1] = 10;
//		array[2] = 15;
//		array[3] = 20;
//		array[4] = 25;
		
		int[] array = { 5, 10, 15, 20, 25 };

		// 2step array�� ��� ���(�ε��� ��)�� ���� ���Ͻÿ�
		int sum = 0;	//������ ������ ����
		for (int i = 0; i < array.length; i++) {
			sum += array[i];	//i = 0~4
		}
		System.out.println(sum);
		
		
		
		
	}
}
