package 뮤직플레이어MVC;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import 뮤직플레이어MVC.Music;

public class MusicController {
	
	//기능을 정의하는  객체
	//필드
	ArrayList<Music> list = new ArrayList<Music>();
	MP3Player player = new MP3Player();
	int index = 0;
	
	
	//MusicController라는 객체가 생성이 될때, Arraylist에 값을 추가
	public MusicController() { //default 생성자
		// Dance Money, Tones and I, 30, (path는 ""로 우선 비워놓기)
		list.add(new Music("Dance Money", "Tones and I", 30, "C:\\Users\\SMT031\\Desktop\\player\\DanceMonkey.mp3"));
		// 에잇, 아이유, 16, ""
		list.add(new Music("에잇", "아이유", 16, "C:\\Users\\SMT031\\Desktop\\player\\Eight.mp3"));
		// 붉은노을, 이문세, 25, ""
		list.add(new Music("붉은노을", "이문세", 25, "C:\\Users\\SMT031\\Desktop\\player\\RedSunSet.mp3"));
		// Dolphin, 오마이걸, 20, ""
		list.add(new Music("Dolphin", "오마이걸", 20, "C:\\Users\\SMT031\\Desktop\\player\\Dolphin.mp3"));
	}
	
	//1. 재생해주는 메소드
	//메소드의 이름은 play , 리턴타입 Music, 매개변수 x
	public Music play() {
		if(!player.isPlaying()) {
			player.play(list.get(index).getPath());	
		}
		return list.get(index);
	}
	
	//2.이전곡을 재생해주는 메소드
	//메소드의 이름은 pre, 리턴타입 Music, 매개변수 x
	public Music pre() {
		if(index==0) {
			return null;
		} else {
			//alt + shift + R을 누르면 변수명을 한 번에 바꿀 수 있어요!
			index--; // i-=1; i=i-1;
			stop();
			player.play(list.get(index).getPath()); 	//list.get(i) == Music이란 객체 
			return list.get(index);
		}
	}
	
	//3.다음곡을 재생하는 메소드
	//메소드의 이름은 next, 리턴타입 Music, 매개변수 x
	//Main문에 있던 코드를 그대로 복사 붙여넣기! 단, 출력문은 지우기
	public Music next() {
		if(index >= list.size()-1) {	//왜-1? ---> 방 번호가 3번까지밖에 없기 때문.
			return null;
		} else { 
			index++;
			stop();
			player.play(list.get(index).getPath()); 	//list.get(i) == Music이란 객체 
			return list.get(index);
		}
	}
	
	//4.재생을 멈추는 메소드
	//메소드의 이름은 stop, 리턴타입X, 매개변수X
	public void stop () {
		if(player.isPlaying()) {
			player.stop();
		}
	}
	
	//5.가수의 이름, 노래제목, 재생시간을 return 메소드
	//메소드의 이름은 songInfo, 리턴타입은 String, 매개변수x
	public String songInfo() {
		return list.get(index).getSongName() + "-" + list.get(index).getSinger() + "-" + list.get(index).getPlayTime();
				
	}


}

