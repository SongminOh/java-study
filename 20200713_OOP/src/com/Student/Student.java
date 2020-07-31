package com.Student;

public class Student {

	//접근제한자 -> private, default, protectd, public
	
	// 필드를 정의할 때는 자료형 변수명; 이렇게 "틀만" 써주시면 됩니다.
	//이름, 나이, 학번, 자바점수, 웹점수, 안드로이드 점수
	//=============================필드, 속성, 변수====================================//
	private String name;
	private String number;
	private int age; 
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	
	
	//===============================기능, 행위=======================================//
	
	//생성자 만들기
	//생성자? new 키워드 통해서, 객체를 만들 때 값을 초기화
	//1.생성자도 메소드!
	//2.생성자는 클래스(=설계도)의 이름과 같아야 함
	//3.생성자는 리턴타입을 지정할 수  없음
	public Student(String name, int age, String number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}
	
	public Student() {
	}
	
	//이름,나이,학번 or 아무것도 없이 생성 or 모든 값을 초기에 다 받는 생성자
	public Student(String name, int age, String number, int scoreJava, int scoreWeb, int socreAndroid) {
		//필드(속성)에 있는 값을 매개변수로 받아온 값으로 넣음
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	
	//메소드를 동일한 이름으로 중복정의 할 수 있음
	//조건: "매개변수"의 개수, 자료형이 달라야 함. 
	//메소드 오버로딩(overloading) == 중복정의
	
	
	
	
	//필드에 값을 넣어줄 수 있는 메소드들
	public void setName(String name) {
		this.name = name; //{} 매개변수로 받아온 애를 우선순위로 둠.
		//위에 있는 필드(=속성=변수)를 지칭하는 키워드 == this
	}
	//나이, 학번, 자바점수, 웹점수, 안드로이드점수를 넣어줄 수 있는 메소드 정의하기.
	//값을 넣어줄 수 있는 메소드명을 지을 때는 set필드이름
	public void setNumber(String number) {
		this.number = number;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}
	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
	
	//각각의 필드를 가지고 오는 메소드 만들기
	//getter 메소드
	public String getName() {
		return name;			//매개변수 없기때문에 this. 키워드 안써도 됨
	}
	public String getNumber() {
		return number;
	}
	public int getAge() {
		return age;
	}
	public int getScoreJava() {
		return scoreJava;
	}
	public int getScoreWeb() {
		return scoreWeb;
	}
	public int getScoreAndroid() {
		return scoreAndroid;
	}

	
	public void show() {
		System.out.println(name + "님 안녕하세요.\n" 
				+ "[ " + number + " , " + age + "살 ]\n"
				+ name + "님의 Java점수는" + scoreJava + "점 입니다.\n"
				+ name + "님의 Web점수는" + scoreWeb + "점 입니다.\n"
				+ name + "님의 Android점수는" + scoreAndroid + "점 입니다.");
	}
	
	
	
}
