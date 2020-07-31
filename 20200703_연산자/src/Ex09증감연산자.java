
public class Ex09증감연산자 {

	public static void main(String[] args) {

		//정수형 변수 i를 선언해서 3이라는 숫자 넣기
		int i = 3; 
		
		//증감연산자는 어디에 위치하느냐에 따라서 실행타이밍이 달라짐.
		System.out.println(++i);  //먼저 1증가하고 출력 됨.
		System.out.println(i++);  //출력문 먼저 실행 된 후 1씩 증가.
		System.out.println(i);
		
		
	}

}
