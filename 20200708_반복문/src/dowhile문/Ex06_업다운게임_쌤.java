package dowhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex06_업다운게임_쌤 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//사용자 입력용
		Random random = new Random();	//난수 추출용
		
		System.out.println("====1~100사이 숫자를 맞춰주세요!!!===");
		int num = random.nextInt(100) + 1; 	//1~100 숫자 추출
		
		int cnt = 0;
		while (++cnt<=7) {			//while(true) {
//			cnt++;				
//			if(cnt>7) {			
//				System.out.println("7회를 넘었습니다. 미안해요~!!");	
//				break;			
//			}
			System.out.print("1에서 100사이 정수를 입력하세요>>");
			int input = sc.nextInt();
			
			if(num == input) {
				System.out.println(num + "정답입니다!!!");
				break;
			} else if (num>input) {
				System.out.println("더 큰수로 다시 시도해보세요.");
			} else if (num<input) {
				System.out.println("더 작은수로 다시 시도해보세요.");
			}
		}
		
	}

}
