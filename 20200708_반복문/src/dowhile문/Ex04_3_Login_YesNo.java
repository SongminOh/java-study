package dowhile문;

import java.util.Scanner;

public class Ex04_3_Login_YesNo {

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
			} else {
				System.out.println("아이디와 비밀번호가 잘못되었습니다.");
				System.out.println("계속 하시겠습니까 ? (Y/N) >>");
				String check = sc.next();
				if (check.equals("N")) {
					System.out.println("종료합니다.");
					break;
				} //else {
					//continue;
				//}
			}
		}

	} 

}
