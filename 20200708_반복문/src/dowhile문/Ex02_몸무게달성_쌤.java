package dowhile문;

import java.util.Scanner;

public class Ex02_몸무게달성 {

	public static void main(String[] args) {

		int weight = 0;
		int goal = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		weight = sc.nextInt();
		System.out.print("목표몸무게 : ");
		goal = sc.nextInt();

		// 주차를 세는 변수
		int week = 1;

		// do-while문 사용!!!
		do {
			// 반복될 구문
			// 감량할 몸무게
			System.out.print(week++ + "주차 감량 몸무게 : ");
			// week += 1;
			int minus = sc.nextInt();
			// 현재 몸무게에 누적시키면서 빼기!
			weight -= minus; // weight = weight - minus;

			// 현재 몸무게가 목표몸무게보다 작거나 같을때
			if (weight <= goal) {
				System.out.println(weight + "kg달성!!! 축하합니다!");
				break;
			}
		} while (true); // while(

	}
}