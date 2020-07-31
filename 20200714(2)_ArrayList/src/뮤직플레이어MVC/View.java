package �����÷��̾�MVC;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {

		//1. ����ڿ��� �����ִ� ������
		//		[1]��� [2]���� [3]������ [4]������ [5]����
		//2. while���� ����Ͽ� scanner�� ����ڿ��� �Է��� �޾��ִ� �ڵ�
		//3. ���ǹ��� ����Ͽ� 1~5���� �������� �������� ���� ���� ��¹��� ���ּ���.
		
		Scanner sc = new Scanner(System.in);
		MusicController control = new MusicController();
		
			while(true) {
				System.out.print("[1]��� [2]���� [3]������ [4]������ [5]����--->");
				//����ڿ��� �Է�
				int input = sc.nextInt();
			
				if (input==1) {
					System.out.println("���");
					control.play();
					System.out.println(control.songInfo());
				} else if (input == 2) {
					System.out.println("����");
					control.stop();
				} else if (input == 3) {
					System.out.println("������");
					Music music = control.pre();
					if (music == null) {
						System.out.println("�������� �����ϴ�.");
					} else {
						System.out.println(control.songInfo());
					}
				} else if (input == 4) {
					System.out.println("������");
					Music music = control.next();
					if (music == null) {
						System.out.println("�������� �����ϴ�.");
					} else {
						System.out.println(control.songInfo());
					}
				} else if (input == 5) {
					System.out.println("����");
					control.stop();
					break;
				} else {
					System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�.");
				}
		}
		
		
	}

}
