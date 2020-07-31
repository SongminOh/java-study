package 뮤직플레이어;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {
	public static void main(String[] args) {

		// 즐거운 뮤직플레이어 시간~~~~~

		// 어레이리스트 만드는거랑 add하는거 while문 위로 빼주세요
		// 1. Music을 담을 수 있는 ArrayList를 생성해주세요!
		ArrayList<Music> list = new ArrayList<Music>();

		
		
		// 2. ArrayList에 4가지의 노래에 관한 정보를 담을 거에요!
		
		// Dance Money, Tones and I, 30, (path는 ""로 우선 비워놓기)
		list.add(new Music("Dance Money", "Tones and I", 30, "C:\\Users\\SMT031\\Desktop\\player\\DanceMonkey.mp3"));
		// 에잇, 아이유, 16, ""
		list.add(new Music("에잇", "아이유", 16, "C:\\Users\\SMT031\\Desktop\\player\\Eight.mp3"));
		// 붉은노을, 이문세, 25, ""
		Music m = new Music("붉은노을", "이문세", 25, "C:\\Users\\SMT031\\Desktop\\player\\RedSunSet.mp3");
		list.add(m);
		// Dolphin, 오마이걸, 20, ""
		list.add(new Music("Dolphin", "오마이걸", 20, "C:\\Users\\SMT031\\Desktop\\player\\Dolphin.mp3"));

		// 실제로 노래를 재생할 수 있는 객체를 생성(player.jar라는 library가 제공)
		MP3Player player = new MP3Player(); // ctrl+space로 자동 import시켜야함
//		player.play("C:\\Users\\SMT031\\Desktop\\player\\Dolphin.mp3");	
//		//play라는 메소드는 주소값을 넣어주면 mp3파일이 재생!
//		
//		player.stop();
//		//멈추는 메소드

		// 1. [1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 -----> 무한으로 반복돼서 출력이 되게 해주세요!
		// 2. 1을 사용자가 입력하면 "재생"이라는 문구가 출력, 2를 사용자가 입력하면 "정지"라는 문구가 출력되고
		// 3을 입력하면 이전곡이라는 문구가 출력, 4를 입력하면 다음곡이라는 문구가 출력, 5를 입력하면 종료!
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료  >> ");
			int input = sc.nextInt(); // 실제로 입력받는 부분

			if (input == 1) {
				System.out.println("재생");
				// 1. 1을 입력하면 가수이름-노래제목-재생시간 출력(Arraylist의 0번째 인덱스)
				// ex) "Tones and I - DanceMonkey - 30"
				Music music = list.get(i);
				System.out.println(music.getSinger() + " - " + music.getSongName() + " - " + music.getPlayTime());
				// 2. 실제로 노래가 재생되게 해주세요.
				player.play(music.getPath());
				
			} else if (input == 2) {
				System.out.println("정지");
				if(player.isPlaying()) { 	//재생이 되고 있는지 여부를 물어보는 거
					player.stop();
				}
				
			} else if (input == 3) {
				System.out.println("이전곡");		//-1
				//-1 ***ArrayOutofIndex ---> 무슨에러지????? 배열 범위초과!!!!! 0~3
				
				if(i==0) {
					System.out.println("이전곡이 없습니다.");
				} else {
					i--; // i-=1; i=i-1;
					if(player.isPlaying()) {
						player.stop();
						player.play(list.get(i).getPath()); 	//list.get(i) == Music이란 객체 
						System.out.println(list.get(i).getSinger() + "-" + list.get(i).getSongName() + "-" + list.get(i).getPlayTime());
					}
				}
			} else if (input == 4) {
				System.out.println("다음곡");		
				//+1
				if(i >= list.size()-1) {	//왜-1? ---> 방 번호가 3번까지밖에 없기 때문.
					System.out.println("다음곡이 없습니다.");
				} else { 
					i++;
					if(player.isPlaying()) {
						player.stop();
						player.play(list.get(i).getPath()); 	//list.get(i) == Music이란 객체 
						System.out.println(list.get(i).getSinger() + "-" + list.get(i).getSongName() + "-" + list.get(i).getPlayTime());
					}
				}
			} else if (input == 5) {
				if(player.isPlaying()) {
					System.out.println("종료");
					player.stop();
				}
				break;
			} else {
				System.out.println("잘못된 숫자를 입력하셨습니다.");
			}

		}
      
		//ctrl + shift + s ---> 내가 새롭게 update한 모든 클래스가 다시 저장이 됩니다.
		sc.close(); //노란색 느낌표 지우고 싶을때 사용
		
	}

}
