
public class Ex01_array {
	public static void main(String[] args) {
		//배열 - 같은 타입의 여러변수를 하나의 묶음으로 다루는 것
		
		//아직 배열을 모른다면...
		int score_김형준 = 100;
		int score_정진청 = 90;
		int score_박성준 = 80;
		//. . . 
		
		int avg = (score_김형준+score_박성준+score_정진청)/3;
		System.out.println(avg);
		
		
		int score_big[] = new int[25];
		//값이 들어가 있지 않은 25(개)의 공간이 할당
		//인덱스로 접근_ 0번부터 시작 하는 (번지)수 24ea
		score_big[0] = 100;	//배열에 값을 넣는 방법
		score_big[1] = 40;
		//.......
		score_big[24] = 70;
		
		
		int score_big2[] = {10,20,30,40,50,60,70,80,90,100};
		//배열을 만듦과 동시에 값을 생성
		
		System.out.println(score_big2[9]);
		System.out.println(score_big2[9]+score_big2[1]); //연산 가능
		
		int sum = 0;
		for (int i = 0; i <= score_big2.length -1; i++) {	
			//범위지정 <=9처럼 직접적인 숫자보다 '배열의 개수'로 지정 (추후 배열안의 값이 수정될 수 있기 때문)
			//i<score_big2.length 혹은 위와같이 지정하면 됨
			sum = sum + score_big2[i];
		}
			System.out.println(sum/score_big2.length);
		
		
		
	}
}
