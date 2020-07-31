package dowhile문;

import java.util.Scanner;

public class Ex04_4_Login_3회 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int chance = 0;

		while (true) {
			System.out.print("아이디를 입력해 주세요 >> ");
			String id = sc.next();
			System.out.print("비밀번호를 입력해 주세요 >> ");
			String pw = sc.next();

			if (id.equals("Hello") && pw.equals("1234")) {
				System.out.println("로그인 성공!");
				break;
			} else {
				chance++;	//횟수를 1씩 증가시킴
				if(chance>=3) {
					System.out.println("아이디와 비밀번호가 3회 틀렸습니다. 본인인증을 해주세요.");
					break;
				}
				System.out.println("아이디와 비밀번호가 잘못되었습니다.");
				System.out.println("계속 하시겠습니까 ? (Y/N) >>");
				String check = sc.next();
				if (check.equals("N")) {
					System.out.println("종료합니다.");
					break;
				} // else {
					// continue;
					// }
			}
			//if (chance == 4) {
				//System.out.println("아이디와 비밀번호가 3회 틀렸습니다. 본인인증을 해주세요.");
				//break;
			//}
		}

	}

}
