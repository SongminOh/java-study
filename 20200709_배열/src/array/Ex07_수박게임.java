package array;

import java.util.Scanner;

public class Ex07_수박게임 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//문자형 배열 선언
		String[] arr = { "수", "박" };	//2칸짜리! 방번호 :0,1 

		System.out.print("숫자를 입력해주세요>>");
		int input = sc.nextInt(); //입력받는 구간

		//7 -> 수박수박수박수
		//1 -> 수
		//2 -> 수박
		
		for (int i = 1; i <= input; i++) {
			if(i%2==1) {
				System.out.print(arr[0]);
			} else {
				System.out.print([1]);
			}
		}
		
		
	}

}
