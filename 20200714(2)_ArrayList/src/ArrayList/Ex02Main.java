package ArrayList;

import java.util.ArrayList;

public class Ex02Main {

	public static void main(String[] args) {

		//Student를 하나로 묶어서 관리할 수 있는 ArrayList를 생성
		ArrayList<Student> list = new ArrayList<Student>();
		
		//1.리스트에 값을 넣어주겠다.
		list.add(new Student("김운비", 20));
		list.add(new Student("공한별", 25));
		list.add(new Student("이용훈", 19));
		
		System.out.println(list.size());
		
		//2.첫번째 인덱스에 있는 김운비라는 이름을 출력
		System.out.println(list.get(0).getName());
		//Student s = list.get(0);
		//System.out.printly(s.getName());
	}

}
