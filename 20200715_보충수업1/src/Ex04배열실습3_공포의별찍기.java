
public class Ex04�迭�ǽ�3_�����Ǻ���� {
	public static void main(String[] args) {
		// 1step ������ �迭�� �����
		int[] array = { 3, 4, 7, 6, 9 };

		// 2step array[0]��°�� �ִ� ���ڸ�ŭ ���� ��´�
		// ��°�� -> *** �Ϸ�
		// 3step array[1]��°�� �ִ� ���ڸ�ŭ ���� ��´�
		// ��°�� -> ****

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j <= array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
