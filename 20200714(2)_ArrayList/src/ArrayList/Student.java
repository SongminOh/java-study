package ArrayList;

public class Student {

	//속성=변수=필드 : 이름, 나이 --> 캡슐화 private
	private String name;
	private int age;
	
	//생성자
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	//기능,행위,메소드 : 이름과 나이의 getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}
