
public class Ex04_array2예제1 {
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
				arr[i][j] = num++; 	//열 단위로(세로로) 값이 먼저 들어가게 됨.
			}
		}

		// 출력은 세로로 할 수 없기에, 위에서 세로로 값을 먼저 넣어준 후 출력문 실행한 것
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[j][i] + "  ");
			} System.out.println();
		}

		
		
		
	}
}
