package array;

import java.util.Scanner;

public class Ex03_arr3 {

	public static void main(String[] args) {
		String name [] = {"김운비", "황해도", "김현진", "박원호", "정형", "손지영"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색 할 이름을 입력하세요. >>");
		String s = sc.next();		// 문자를 입력 받는 방법
		
		for (int i = 0; i < name.length; i++) {
			
			if(s.equals(name[i])) {
				System.out.println(s+ "님은 " + i + "번째 인덱스에 있습니다.");
				break;
			}
			
			//System.out.println(s+"님은 " + i + "번째 인덱스에 저장 되어 있습니다.");
		}
		
		
		
		
	}

}
