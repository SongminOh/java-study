
public class Ex11_공포의별찍기2 {

	public static void main(String[] args) {
		for (int j = 1; j <= 5; j++) {
		// j = 1 시작
		// j = 2
			for (int i = 1; i <= 6 - j; i++) {
				// i=1 i=2 i=3 i=4 i=5
				// i=1 ~ 4
				// i=1 ~ 3
				System.out.print("*");
			}
			System.out.println();
		}

//			for (int j = 5; j > 0; j--) {
//				if (i > j) {
//					System.out.println("");
//				} else
//					System.out.print("*");
//			}
//		}
	}

}
