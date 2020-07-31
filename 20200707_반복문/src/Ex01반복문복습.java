
public class Ex01반복문복습 {

	public static void main(String[] args) {
		// 반복문 복습
		// for 반복문 : 주로 반복횟수가 정해졌을때 사용된다.
		// for문 구조>> for(초기화구문;조건식;반복후작업)
		// 초기화구문 : 단 한번만 실행되는 부분
		int i;
		for(i = 1; i <= 10; i++) {			//i는 조건 불충분으로 출력이 안됐을 뿐 11까지 증가.
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println("최종 i 값 = " + i);
	}

}
