
public class Ex10_�����Ǻ����1 {

	public static void main(String[] args) {
		char c = '*';
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c);
				if (j == i) {
					System.out.println();
				}
			}

		}
	}

}
