package dowhile문;

import java.util.Scanner;

public class Ex04_2_Login반복묻기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("아이디를 입력해 주세요 >> ");
			String id = sc.next();
			System.out.print("비밀번호를 입력해 주세요 >> ");
			String pw = sc.next();

			if (id.equals("Hello") && pw.equals("1234")) {
				System.out.println("로그인 성공!");
				break;
			} else  {
				System.out.println("아이디와 비밀번호가 잘못되었습니다.");
			}
		}
	}

}
