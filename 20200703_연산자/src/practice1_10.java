import java.util.Scanner;

public class practice1_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);      // sc +ctrl+space <=�ڵ��ϼ�
		System.out.print("Java ���� �Է� : ");
		int javaScore = sc.nextInt();
		System.out.print("Web ���� �Է� : ");
		int webScore = sc.nextInt();              // ne +ctrl+space <=�ڵ��ϼ�
		System.out.print("Android ���� �Է� : ");
		int androidScore = sc.nextInt();
		
		//������ �ڵ��ϼ� ��
		int sum = javaScore + webScore + androidScore;
		int avg = sum / 3;
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
	}

}
