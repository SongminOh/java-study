
public class Ex05_array2예제snake {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		int num = 1;

//		for (int j = 0; j < arr.length; j++) {
//			if (j % 2 == 0) {		//0행,2행,4행... ->정방향으로 값 대입
//				for (int i = 0; i < arr.length; i++) {
//					arr[j][i] = num++;
//				} 
//			} else {				//1행,3행,5행... ->역방향으로 값 대입
//				for (int i = arr.length-1; i >= 0; i--) {	//개수는>0, 인덱스는>=0 ==> 시작값 -1의 이유
//					arr[j][i] = num++;
//				}
//			}
//		}
		
		int start = 0;
		int end = arr.length -1 ;
		int temp = 0;	//치환하기 위한 변수
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
		
		
		
		//출력문장
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[j][i] + "  ");
			}
			System.out.println();
		}

	}

}
