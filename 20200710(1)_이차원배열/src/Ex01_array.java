
public class Ex01_array {
	public static void main(String[] args) {
		//�迭 - ���� Ÿ���� ���������� �ϳ��� �������� �ٷ�� ��
		
		//���� �迭�� �𸥴ٸ�...
		int score_������ = 100;
		int score_����û = 90;
		int score_�ڼ��� = 80;
		//. . . 
		
		int avg = (score_������+score_�ڼ���+score_����û)/3;
		System.out.println(avg);
		
		
		int score_big[] = new int[25];
		//���� �� ���� ���� 25(��)�� ������ �Ҵ�
		//�ε����� ����_ 0������ ���� �ϴ� (����)�� 24ea
		score_big[0] = 100;	//�迭�� ���� �ִ� ���
		score_big[1] = 40;
		//.......
		score_big[24] = 70;
		
		
		int score_big2[] = {10,20,30,40,50,60,70,80,90,100};
		//�迭�� ����� ���ÿ� ���� ����
		
		System.out.println(score_big2[9]);
		System.out.println(score_big2[9]+score_big2[1]); //���� ����
		
		int sum = 0;
		for (int i = 0; i <= score_big2.length -1; i++) {	
			//�������� <=9ó�� �������� ���ں��� '�迭�� ����'�� ���� (���� �迭���� ���� ������ �� �ֱ� ����)
			//i<score_big2.length Ȥ�� ���Ͱ��� �����ϸ� ��
			sum = sum + score_big2[i];
		}
			System.out.println(sum/score_big2.length);
		
		
		
	}
}
