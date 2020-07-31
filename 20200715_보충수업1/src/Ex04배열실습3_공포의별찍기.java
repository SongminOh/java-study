
public class Ex04배열실습3_공포의별찍기 {
	public static void main(String[] args) {
		// 1step 정수형 배열을 만든다
		int[] array = { 3, 4, 7, 6, 9 };

		// 2step array[0]번째에 있는 숫자만큼 별을 찍는다
		// 출력결과 -> *** 완료
		// 3step array[1]번째에 있는 숫자만큼 별을 찍는다
		// 출력결과 -> ****

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j <= array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
