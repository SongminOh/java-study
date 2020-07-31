
public class Ex03_array2 {
	public static void main(String[] args) {
		int array[][] = new int[5][5];
		
//		array[0][0] = 1;
//		array[0][1] = 2;
//		array[0][2] = 3;
//		array[0][3] = 4;
//		array[0][4] = 5;
		
		//값을 넣는 문장
		int num = 1;
		
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				array[j][i] = num++;
			}
		}
		
		//출력문장
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		
//		array[1][0] = 6;
//		array[1][1] = 7;
//		array[1][2] = 8;
//		array[1][3] = 9;
//		array[1][4] = 10;
//		for(int i = 0; i < 5; i++) {
//			array[1][i] = num++;
//		}
		
//		array[2][0] = 11;
//		array[2][1] = 12;
//		array[2][2] = 13;
//		array[2][3] = 14;
//		array[2][4] = 15;
//		for(int i = 0; i < 5; i++) {
//			array[2][i] = num++;
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			array[3][i] = num ++;
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			array[4][i] = num ++;
		
		
	}
}
