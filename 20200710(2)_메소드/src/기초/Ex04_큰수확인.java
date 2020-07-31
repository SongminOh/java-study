package 기초;

public class Ex04_큰수확인 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 24;
		int result = largerNumbers(num1, num2);
		System.out.println("큰 수 확인 : " + result);
	}
	//타 메소드 밖, 클래스 안
	//접근제한자 static 리턴타입 메소드이름(매개변수)
	public static int largerNumbers(int num1, int num2) {
		//더 큰수가 무엇인지 찾아야함!
//		int result = num1 > num2 ? num1 : num2;		두 수 같은경우에도 num2출력됨
		int result = 0;		//중괄호 안에쓰면 그 안에서만 쓸 수 있기 때문에 if문 밖에서 선언
		if (num1 > num2) {
			result = num1;				//위에result선언안하고 return num1;
		} else if (num1 < num2) {
			result = num2;				//return num2;
		} else {
			result = 0;					//return 0;
		}
		return result; //return을 만나면 메소드는 종료됨! 단순 result출력이아닌 값을 내 놓는 것임!
	}




}
