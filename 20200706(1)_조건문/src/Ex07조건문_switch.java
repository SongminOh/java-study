import java.util.Scanner;

public class Ex07조건문_switch {

	public static void main(String[] args) {
		
		int data = 2;
		
		//switch(딱 떨어지는 값)     // (data%2)가능. (data%2==0)불가능
		switch(data) {         
		case 1:
			System.out.println("data는 1입니다.");
			break;      //조건문이나 반복문을 탈출하는 키워드
		case 2:
			System.out.println("data는 2입니다.");
			break;
		case 3:
			System.out.println("data는 3입니다.");
			break;
		default:
			System.out.println("data는 1,2,3에 속하지 않습니다.");
			break;
		}
	}
}
