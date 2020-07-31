package �����÷��̾�MVC;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import �����÷��̾�MVC.Music;

public class MusicController {
	
	//����� �����ϴ�  ��ü
	//�ʵ�
	ArrayList<Music> list = new ArrayList<Music>();
	MP3Player player = new MP3Player();
	int index = 0;
	
	
	//MusicController��� ��ü�� ������ �ɶ�, Arraylist�� ���� �߰�
	public MusicController() { //default ������
		// Dance Money, Tones and I, 30, (path�� ""�� �켱 �������)
		list.add(new Music("Dance Money", "Tones and I", 30, "C:\\Users\\SMT031\\Desktop\\player\\DanceMonkey.mp3"));
		// ����, ������, 16, ""
		list.add(new Music("����", "������", 16, "C:\\Users\\SMT031\\Desktop\\player\\Eight.mp3"));
		// ��������, �̹���, 25, ""
		list.add(new Music("��������", "�̹���", 25, "C:\\Users\\SMT031\\Desktop\\player\\RedSunSet.mp3"));
		// Dolphin, �����̰�, 20, ""
		list.add(new Music("Dolphin", "�����̰�", 20, "C:\\Users\\SMT031\\Desktop\\player\\Dolphin.mp3"));
	}
	
	//1. ������ִ� �޼ҵ�
	//�޼ҵ��� �̸��� play , ����Ÿ�� Music, �Ű����� x
	public Music play() {
		if(!player.isPlaying()) {
			player.play(list.get(index).getPath());	
		}
		return list.get(index);
	}
	
	//2.�������� ������ִ� �޼ҵ�
	//�޼ҵ��� �̸��� pre, ����Ÿ�� Music, �Ű����� x
	public Music pre() {
		if(index==0) {
			return null;
		} else {
			//alt + shift + R�� ������ �������� �� ���� �ٲ� �� �־��!
			index--; // i-=1; i=i-1;
			stop();
			player.play(list.get(index).getPath()); 	//list.get(i) == Music�̶� ��ü 
			return list.get(index);
		}
	}
	
	//3.�������� ����ϴ� �޼ҵ�
	//�޼ҵ��� �̸��� next, ����Ÿ�� Music, �Ű����� x
	//Main���� �ִ� �ڵ带 �״�� ���� �ٿ��ֱ�! ��, ��¹��� �����
	public Music next() {
		if(index >= list.size()-1) {	//��-1? ---> �� ��ȣ�� 3�������ۿ� ���� ����.
			return null;
		} else { 
			index++;
			stop();
			player.play(list.get(index).getPath()); 	//list.get(i) == Music�̶� ��ü 
			return list.get(index);
		}
	}
	
	//4.����� ���ߴ� �޼ҵ�
	//�޼ҵ��� �̸��� stop, ����Ÿ��X, �Ű�����X
	public void stop () {
		if(player.isPlaying()) {
			player.stop();
		}
	}
	
	//5.������ �̸�, �뷡����, ����ð��� return �޼ҵ�
	//�޼ҵ��� �̸��� songInfo, ����Ÿ���� String, �Ű�����x
	public String songInfo() {
		return list.get(index).getSongName() + "-" + list.get(index).getSinger() + "-" + list.get(index).getPlayTime();
				
	}


}

