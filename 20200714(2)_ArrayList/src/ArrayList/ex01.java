package ArrayList;

import java.util.ArrayList;

public class ex01 {
	public static void main(String[] args) {
		
		//ArrayList생성
		//String -> 레퍼런스 변수
		
		//String을 담을 수 있는 ArrayList를 생성
		ArrayList<String> list = new ArrayList<String>();	//뒤에 <>안은 생략 가능!
		
		//우리가 좋아하는 음식을 담은 리스트를 생성
		//1.리스트에 값 추가하기!
		list.add("광어");
		list.add("맥주");
		list.add("소맥");
		list.add("티라미수");
		list.add("피자");
		list.add("두유");
		
		//2.리스트의 크기를 보는 방법
		System.out.println(list.size()); 	//array.length
		list.add("살짝 물렁한 딱복");
		System.out.println(list.size());
		
		//3.리스트 값을 지우는 방법 ----> remove(인덱스 번호)
		list.remove(5);
		System.out.println(list.size());
		
		//4.리스트 사이에 값을 추가하는 방법
		list.add(1, "두부");
		
		//5.리스트 인덱스에 접근하는 방법
		String name = list.get(1);
		System.out.println(name);
		
		//6.리스트에 있는 모든값들을 한!번!에! 지우는 방법
		list.clear();
		System.out.println(list.size());
		
		
		
		
	}
}
