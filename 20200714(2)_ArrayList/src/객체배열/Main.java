package 객체배열;

public class Main {
	public static void main(String[] args) {
		
		//Student객체배열
		Student[] array = new Student[5];
		System.out.println(array);		//주소(번지)
		System.out.println(array[0]);	//null
		//array[0] -> Student -> 실체화시켜준적? 없음
		array[0] = new Student();
//		System.out.println(array[0]);
		for (int i = 0; i < array.length; i++) {	//내부 실체화(instance) 시키기
			array[i] = new Student();
			System.out.println(array[i]);
			array[i].getAge();
		}
	}
}
