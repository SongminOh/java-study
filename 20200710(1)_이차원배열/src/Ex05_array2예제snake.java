
public class Ex05_array2����snake {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		int num = 1;

//		for (int j = 0; j < arr.length; j++) {
//			if (j % 2 == 0) {		//0��,2��,4��... ->���������� �� ����
//				for (int i = 0; i < arr.length; i++) {
//					arr[j][i] = num++;
//				} 
//			} else {				//1��,3��,5��... ->���������� �� ����
//				for (int i = arr.length-1; i >= 0; i--) {	//������>0, �ε�����>=0 ==> ���۰� -1�� ����
//					arr[j][i] = num++;
//				}
//			}
//		}
		
		int start = 0;
		int end = arr.length -1 ;
		int temp = 0;	//ġȯ�ϱ� ���� ����
		int reverse = 1;
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = start; j != end + reverse; j += reverse) {
				arr[i][j] = num++;
			}
			temp = start;
			start = end;
			end = temp;
			reverse = reverse*-1;
		}
		
		
		
		//��¹���
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[j][i] + "  ");
			}
			System.out.println();
		}

	}

}
