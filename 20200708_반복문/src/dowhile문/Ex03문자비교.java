package dowhile문;

import java.util.Scanner;

public class Ex03문자비교 {

	public static void main(String[] args) {

		//문자=char '', 문자열 = String ""
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next(); //문자열 입력받는 방법, String -> 기본형이 아님!
		
		if (name.equals("김운비")) {	//문자열을 비교하는 방법 -> .equlas(비교할 문자)
			System.out.println("같아");
		}
	}

}
