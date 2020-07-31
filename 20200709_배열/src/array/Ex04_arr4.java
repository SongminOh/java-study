package array;

import java.util.Scanner;

public class Ex04_arr4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score[] = new int[5];
		// int a = 1;
		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "번째 입력>> "); // a++ + ".. 도 가능
			int num = sc.nextInt();
			score[i] = num;
		}
		System.out.print("입력한 점수 : ");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}

System.out.println();

		int max = score[0]; // 최고점수임의의 변수	초깃값은 0보다 변수[0]이 더 효율적
		int min = score[0]; // 최저점수 임의의 변수
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		
		
		//총합이랑 평균 구하는 코드
		
		int sum = 0;
		for (int i = 0;  i < score.length; i++) {
			sum += score[i];
			//sum = sum + score[i]
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum / score.length);
		
		
//		같은타입의 여러변수를 하나로 묶은것 = "배열"
//		인덱스로 접근 가능. 0번지부터 접근
	}

}
