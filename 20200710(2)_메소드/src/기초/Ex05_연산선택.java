package 기초;

public class Ex05_연산선택 {

	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 50;
		char op = '*';
		
		System.out.println(cal(num1,num2,op));
	}
	public static int cal(int num1, int num2, char op) {
		int result = 0;
		switch (op) {
		case '+' :
			result = num1 + num2;
			break;
		case '-' :
			result = num1 > num2 ? num1 - num2 : num2 - num1;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = num1 / num2;
			break;
		default:
			result = 0;
		}
		
		return result;
		
		
//		if (op == '+') {
//			result = num1 + num2;
//		} else if (op == '-') {
//			if (num1 > num2) {
//				result = num1 - num2;
//			} else if (num1 < num2) {
//				result = num2 -num1 ;
//			} else if (num1 == num2) {
//				result = 0;
//			}
//		} else if (op == '*') {
//			result = num1 * num2;
//		} else if (op == '/') {
//			result = num1 / num2;
//		}
//		return result;		
	}
	
	
}
