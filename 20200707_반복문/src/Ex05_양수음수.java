
public class Ex05_양수음수 {

	public static void main(String[] args) {
		// 1step. 1부터 100까지 출력 (옆으로)
		//for(int i = 1; i<=100; i++) {
		//	System.out.print(i + " ");
		//}
		// 2step. 1부터 100까지 짝수를 판별
		// 3step. 홀수는 그대로 출력 짝수일때만 음수로 변환해서 출력
		//								(자기자신에 -1 곱해서 출력)
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i * -1 + " ");
			} else {
				System.out.print(i + " ");
			}
		}
	}

}
