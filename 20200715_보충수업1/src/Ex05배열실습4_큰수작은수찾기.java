
public class Ex05�迭�ǽ�4_ū��������ã�� {

	public static void main(String[] args) {
		int[] array = { 1, 13, 5, 9, 7, 22, 35, 78, 99, 10, 17 };
		// 1step �ּڰ��� �ִ��� ������ ���� �ΰ��� �����
		// 2step 0��° �ε��� ������ �ּڰ��� �ִ��� ���Ѵ�
		// 3step �ּڰ����� �� �۰ų� �ִ񰪺��� �� ū ���� �ִٸ� ���� �������ش�
		// 4step �ּڰ� ������ �ִ� ������ ���� ����Ѵ�
		
		int min = array[0];	//�������� 0��° ���� �־��ش� (0��° �ƴϿ��� �������)
		int max = array[0]; 
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			else if (array[i] > max) { 		//if (array[i] > max) {
				max = array[i];			
			}
		}
		System.out.println("�ּڰ� : " + min + " �ִ� : " + max);
		
		// ��� -> �ּҰ� : 1  �ִ밪 : 99
	}
}
