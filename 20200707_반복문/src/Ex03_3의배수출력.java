
public class Ex03_3의배수출력 {

	public static void main(String[] args) {
		// 1부터 100까지의 3의 배수만 출력해주세요
		// 1step. 1부터 100까지 출력
		// 2step. 1부터 100까지의 수 중에서 3의 배수 판별
		//			(3의 배수 == 어떤 수를 3으로 나눴을때 나머지가 0)
		// 3step. 3의 배수일때만 출력
		
//		for(int i = 1; i <= 100; i++) {
//			//System.out.println(i);
//			if (i % 3 == 0) {
//				System.out.print(i + " ");
//			}
//		}
		
		// 1step. 3부터 100까지 3의 배수로 증가한다
		// 2step. 증가한 값을 출력
		for(int i = 3; i <= 100; i+=3) {
			System.out.print(i + " ");
		}
	}

}
