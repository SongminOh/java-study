
public class Ex04_array2����1 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		//0,0 = 1
		//1,0 = 2
		//2,0 = 3
		//3,0 = 4
		//4,0 = 5
		
		int num = 1;

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				arr[i][j] = num++; 	//�� ������(���η�) ���� ���� ���� ��.
			}
		}

		// ����� ���η� �� �� ���⿡, ������ ���η� ���� ���� �־��� �� ��¹� ������ ��
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[j][i] + "  ");
			} System.out.println();
		}

		
		
		
	}
}
