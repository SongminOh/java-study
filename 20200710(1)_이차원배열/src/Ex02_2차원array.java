
public class Ex02_2����array {
	public static void main(String[] args) {

		//1���� �迭
		int[] array1 = new int[3];
		
		//2�����迭
		int[][] array2 = new int[3][2];
		//3�� 2���� 2���� �迭�� �������
		
		//	   1��	 2��
		//1��  1��1��   1��2��			0,0(10)   0,1(14)
		//2��  2��1��	2��2��			1,0		  1,1
		//3��  3��1��	3��2��			2,0		  2,1

		array2[0][0] = 10;
		array2[0][1] = 14;
		array2[1][0] = 2;
		array2[1][1] = 5;
		array2[2][0] = 60;
		array2[2][1] = 33;
		
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 2; i++) {
				System.out.print(array2[j][i]+" ");
			}
			System.out.println();
		}
		
		
//		for(int i = 0; i < 2; i++) {
//			System.out.println(array2[1][i]+" ");
//		}
//		System.out.println();
//		System.out.println();
//		for(int i = 0; i < 2; i++) {
//			System.out.println(array2[2][i]+" ");
//		}
//		System.out.println();
		
		
//		System.out.print(array2[0][0] + " ");
//		System.out.print(array2[0][1] + " ");
//		System.out.println();
//		System.out.print(array2[1][0] + " ");
//		System.out.print(array2[1][1] + " ");
//		System.out.println();
//		System.out.print(array2[2][0] + " ");
//		System.out.print(array2[2][1] + " ");
//		
		
	
	}
}
