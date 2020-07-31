
public class Ex01배열기초 {

	public static void main(String[] args) {
		// 우리는 도대체 왜 어려운 배열을 사용해야 할까?
		// 배열을 사용하는 이유?
		// ArrayList <- 배열과 매우 흡사한 녀석
		// 배열, ArrayList, Map -> 대량의 데이터를 효율적으로 관리하기 위해
		// 동일한 자료형 나열해서 저장, 크기 고정되어있음 -> 배열의 특징

		// 이름을 저장하는 크기가 3인 배열을 생성
		// 첫번째 방법 : 크기를 먼저 지정하고 값을 넣는 방법
		String[] names = new String[3];
		names[0] = "박병관";
		names[1] = "김미희";
		names[2] = "김운비";
		// names[3] = "김동원"; -error 발생 index 값 초과

		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

		// 두번째 방법 : 값을 넣음과 동시에 크기를 설정하는 방법
		// 전체 값을 알고 있을때 많이 사용하는 방법

		String[] sports = { "야구", "농구", "축구", "배구" };
		System.out.println(sports[0]);
		System.out.println(sports[1]);
		System.out.println(sports[2]);
		System.out.println(sports[3]);
		
		
		
		
		
	}

}
