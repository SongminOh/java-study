package dowhile문;

import java.util.Scanner;

public class Ex04_1_Login프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해 주세요 >> ");
		String id = sc.next();
		System.out.println("비밀번호를 입력해 주세요 >> ");
		String pw = sc.next();
		
		if ( id.equals("Hello") && pw.equals("1234") ) {
			System.out.println("로그인 성공!");
//		} else if (id.equals("Hello")) {
//			System.out.println("비밀번호 오류");
//		} else if (pw.equals("1234")) {
//			System.out.println("아이디 오류");
		} else {
			System.out.println("아이디와 비밀번호가 잘못되었습니다.");
		}
		
		
	}

}
