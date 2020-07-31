package com.Student;

public class Student_main {
	public static void main(String[] args) {

		//하나의 설계도로 2개의 "객체" 생성
		//설계도의 이름 | {}안에서 사용할 이름 = new(객체생성 키워드) |설계도의 이름();
		Student student1 = new Student("김땡떙", 20, "20200518");	//student1이라는 객체 생성됨
		
		//이름, 나이, 학번 초기화 or 아무것도 없이 아까처럼 () 생성이 되게 만들고 싶어요!
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(student1.getNumber());
		
		System.out.println("==================================");
		
//		student1.show();	//null값 출력됨
	
		//우회해서 값을 넣어줘야 함!
		//setter
//		student1.name = "김운비";				//필드에 직접적으로 접근하여 값을 넣은것
//		student1.number = "20200878";
//		student1.age = 20;
//		student1.scoreJava = 50;
//		student1.scoreWeb = 99;
//		student1.scoreAndroid = 77;
		student1.setName("김운비");			//기능사용하여 우회하여 값을 넣어줌
		student1.setNumber("20200878");
		student1.setAge(20);
		student1.setScoreJava(50);
		student1.setScoreWeb(99);
		student1.setScoreAndroid(77);
		student1.show();
		
		System.out.println("==================================");

		Student student2 = new Student();	//student2라는 객체 생성됨
//		student2.name = "김미희";
//		student2.number = "20200458";
//		student2.age = 20;
//		student2.scoreJava = 90;
//		student2.scoreWeb = 25;
//		student2.scoreAndroid = 50;
		System.out.println(student2.getScoreJava());	//값 셋팅 전이기에 int의 기본값 0이 출력됨
		System.out.println(student2.getName());			//String의 기본값 null
		student2.setName("김미희");
		student2.setNumber("20200458");
		student2.setAge(20);
		student2.setScoreJava(90);
		student2.setScoreWeb(25);
		student2.setScoreAndroid(50);
		student2.show();
				
		System.out.println("==================================");
		
		//student2객체가 가지고 있는 자바점수만 보고싶다면?
		System.out.println(student2.getScoreJava());
	
	
	}
}
