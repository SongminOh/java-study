
public class Ex05_������� {

	public static void main(String[] args) {
		// 1step. 1���� 100���� ��� (������)
		//for(int i = 1; i<=100; i++) {
		//	System.out.print(i + " ");
		//}
		// 2step. 1���� 100���� ¦���� �Ǻ�
		// 3step. Ȧ���� �״�� ��� ¦���϶��� ������ ��ȯ�ؼ� ���
		//								(�ڱ��ڽſ� -1 ���ؼ� ���)
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i * -1 + " ");
			} else {
				System.out.print(i + " ");
			}
		}
	}

}
