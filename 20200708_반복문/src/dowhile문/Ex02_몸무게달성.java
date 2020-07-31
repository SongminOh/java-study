package dowhile문;

import java.util.Scanner;

public class Ex02_몸무게달성 {

	public static void main(String[] args) {

		int current;
		int goal;  
		int week = 1;
		//int lost = 0;      >>> do 안에서 선언해도 됨.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		current = sc.nextInt();
		System.out.print("목표몸무게 : ");
		goal = sc.nextInt();

		do {
			System.out.print(week + "주차 감량 몸무게 : ");
			int lost = sc.nextInt();
			current -= lost;
			week += 1;
		} while (current > goal);
		System.out.println(current + "kg 달성!! 축하합니다!!");

	}

}
