
public class Ex03_3�ǹ����� {

	public static void main(String[] args) {
		// 1���� 100������ 3�� ����� ������ּ���
		// 1step. 1���� 100���� ���
		// 2step. 1���� 100������ �� �߿��� 3�� ��� �Ǻ�
		//			(3�� ��� == � ���� 3���� �������� �������� 0)
		// 3step. 3�� ����϶��� ���
		
//		for(int i = 1; i <= 100; i++) {
//			//System.out.println(i);
//			if (i % 3 == 0) {
//				System.out.print(i + " ");
//			}
//		}
		
		// 1step. 3���� 100���� 3�� ����� �����Ѵ�
		// 2step. ������ ���� ���
		for(int i = 3; i <= 100; i+=3) {
			System.out.print(i + " ");
		}
	}

}
