
public class Ex02배열실습1_총합구하기 {
	public static void main(String[] args) {

		// 1step 길이가 5인 정수형 배열안에 순차적으로 5,10,15,20,25의 값을 넣어서 생성하시오
		// 배열의 이름 array
		
//		int[]array = new int[5];
//		array[0] = 5;
//		array[1] = 10;
//		array[2] = 15;
//		array[3] = 20;
//		array[4] = 25;
		
		int[] array = { 5, 10, 15, 20, 25 };

		// 2step array안 모든 요소(인데스 안)의 합을 구하시오
		int sum = 0;	//총합을 저장할 변수
		for (int i = 0; i < array.length; i++) {
			sum += array[i];	//i = 0~4
		}
		System.out.println(sum);
		
		
		
		
	}
}
