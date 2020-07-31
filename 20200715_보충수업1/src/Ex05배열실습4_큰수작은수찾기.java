
public class Ex05배열실습4_큰수작은수찾기 {

	public static void main(String[] args) {
		int[] array = { 1, 13, 5, 9, 7, 22, 35, 78, 99, 10, 17 };
		// 1step 최솟값과 최댓값을 저장할 변수 두개를 만든다
		// 2step 0번째 인덱스 값부터 최솟값과 최댓값을 비교한다
		// 3step 최솟값보다 더 작거나 최댓값보다 더 큰 값이 있다면 값을 변경해준다
		// 4step 최솟값 변수와 최댓값 변수의 값을 출력한다
		
		int min = array[0];	//기준점인 0번째 값을 넣어준다 (0번째 아니여도 상관없음)
		int max = array[0]; 
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			else if (array[i] > max) { 		//if (array[i] > max) {
				max = array[i];			
			}
		}
		System.out.println("최솟값 : " + min + " 최댓값 : " + max);
		
		// 결과 -> 최소값 : 1  최대값 : 99
	}
}
