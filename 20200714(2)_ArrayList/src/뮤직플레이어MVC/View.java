package 뮤직플레이어MVC;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {

		//1. 사용자에게 보여주는 선택지
		//		[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료
		//2. while문을 사용하여 scanner로 사용자에게 입력을 받아주는 코드
		//3. 조건문을 사용하여 1~5까지 선택지를 선택했을 때에 관한 출력문을 써주세요.
		
		Scanner sc = new Scanner(System.in);
		MusicController control = new MusicController();
		
			while(true) {
				System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료--->");
				//사용자에게 입력
				int input = sc.nextInt();
			
				if (input==1) {
					System.out.println("재생");
					control.play();
					System.out.println(control.songInfo());
				} else if (input == 2) {
					System.out.println("정지");
					control.stop();
				} else if (input == 3) {
					System.out.println("이전곡");
					Music music = control.pre();
					if (music == null) {
						System.out.println("이전곡이 없습니다.");
					} else {
						System.out.println(control.songInfo());
					}
				} else if (input == 4) {
					System.out.println("다음곡");
					Music music = control.next();
					if (music == null) {
						System.out.println("다음곡이 없습니다.");
					} else {
						System.out.println(control.songInfo());
					}
				} else if (input == 5) {
					System.out.println("종료");
					control.stop();
					break;
				} else {
					System.out.println("잘못된 번호를 입력하셨습니다.");
				}
		}
		
		
	}

}
