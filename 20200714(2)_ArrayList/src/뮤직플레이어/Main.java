package �����÷��̾�;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {
	public static void main(String[] args) {

		// ��ſ� �����÷��̾� �ð�~~~~~

		// ��̸���Ʈ ����°Ŷ� add�ϴ°� while�� ���� ���ּ���
		// 1. Music�� ���� �� �ִ� ArrayList�� �������ּ���!
		ArrayList<Music> list = new ArrayList<Music>();

		
		
		// 2. ArrayList�� 4������ �뷡�� ���� ������ ���� �ſ���!
		
		// Dance Money, Tones and I, 30, (path�� ""�� �켱 �������)
		list.add(new Music("Dance Money", "Tones and I", 30, "C:\\Users\\SMT031\\Desktop\\player\\DanceMonkey.mp3"));
		// ����, ������, 16, ""
		list.add(new Music("����", "������", 16, "C:\\Users\\SMT031\\Desktop\\player\\Eight.mp3"));
		// ��������, �̹���, 25, ""
		Music m = new Music("��������", "�̹���", 25, "C:\\Users\\SMT031\\Desktop\\player\\RedSunSet.mp3");
		list.add(m);
		// Dolphin, �����̰�, 20, ""
		list.add(new Music("Dolphin", "�����̰�", 20, "C:\\Users\\SMT031\\Desktop\\player\\Dolphin.mp3"));

		// ������ �뷡�� ����� �� �ִ� ��ü�� ����(player.jar��� library�� ����)
		MP3Player player = new MP3Player(); // ctrl+space�� �ڵ� import���Ѿ���
//		player.play("C:\\Users\\SMT031\\Desktop\\player\\Dolphin.mp3");	
//		//play��� �޼ҵ�� �ּҰ��� �־��ָ� mp3������ ���!
//		
//		player.stop();
//		//���ߴ� �޼ҵ�

		// 1. [1]��� [2]���� [3]������ [4]������ [5]���� -----> �������� �ݺ��ż� ����� �ǰ� ���ּ���!
		// 2. 1�� ����ڰ� �Է��ϸ� "���"�̶�� ������ ���, 2�� ����ڰ� �Է��ϸ� "����"��� ������ ��µǰ�
		// 3�� �Է��ϸ� �������̶�� ������ ���, 4�� �Է��ϸ� �������̶�� ������ ���, 5�� �Է��ϸ� ����!
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (true) {
			System.out.print("[1]��� [2]���� [3]������ [4]������ [5]����  >> ");
			int input = sc.nextInt(); // ������ �Է¹޴� �κ�

			if (input == 1) {
				System.out.println("���");
				// 1. 1�� �Է��ϸ� �����̸�-�뷡����-����ð� ���(Arraylist�� 0��° �ε���)
				// ex) "Tones and I - DanceMonkey - 30"
				Music music = list.get(i);
				System.out.println(music.getSinger() + " - " + music.getSongName() + " - " + music.getPlayTime());
				// 2. ������ �뷡�� ����ǰ� ���ּ���.
				player.play(music.getPath());
				
			} else if (input == 2) {
				System.out.println("����");
				if(player.isPlaying()) { 	//����� �ǰ� �ִ��� ���θ� ����� ��
					player.stop();
				}
				
			} else if (input == 3) {
				System.out.println("������");		//-1
				//-1 ***ArrayOutofIndex ---> ����������????? �迭 �����ʰ�!!!!! 0~3
				
				if(i==0) {
					System.out.println("�������� �����ϴ�.");
				} else {
					i--; // i-=1; i=i-1;
					if(player.isPlaying()) {
						player.stop();
						player.play(list.get(i).getPath()); 	//list.get(i) == Music�̶� ��ü 
						System.out.println(list.get(i).getSinger() + "-" + list.get(i).getSongName() + "-" + list.get(i).getPlayTime());
					}
				}
			} else if (input == 4) {
				System.out.println("������");		
				//+1
				if(i >= list.size()-1) {	//��-1? ---> �� ��ȣ�� 3�������ۿ� ���� ����.
					System.out.println("�������� �����ϴ�.");
				} else { 
					i++;
					if(player.isPlaying()) {
						player.stop();
						player.play(list.get(i).getPath()); 	//list.get(i) == Music�̶� ��ü 
						System.out.println(list.get(i).getSinger() + "-" + list.get(i).getSongName() + "-" + list.get(i).getPlayTime());
					}
				}
			} else if (input == 5) {
				if(player.isPlaying()) {
					System.out.println("����");
					player.stop();
				}
				break;
			} else {
				System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
			}

		}
      
		//ctrl + shift + s ---> ���� ���Ӱ� update�� ��� Ŭ������ �ٽ� ������ �˴ϴ�.
		sc.close(); //����� ����ǥ ����� ������ ���
		
	}

}
