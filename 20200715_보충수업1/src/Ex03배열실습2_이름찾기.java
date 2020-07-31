import java.util.Scanner;

public class Ex03배열실습2_이름찾기 {
	public static void main(String[] args) {
		// 1step. 길이가 3인 문자열 배열 names를 생성하시오.

		String[] names = new String[3];

		// 2step. names 모든 인덱스 안에 키보드로부터 이름을 입력하여 저장하시오.
		// 0번째 인덱스부터 2번쨰 인덱스까지 저장하시면 됩니다
		// 예: 이름입력 : 박병관 -> names[0]번째 저장
		// 이름입력 : 손지영 -> names[1]번째 저장
		// 이름입력 : 최태양 -> names[2]번째 저장

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < names.length; i++) {
			System.out.print("이름입력 : ");
			names[i] = sc.next(); // i= 0~2
		}

		// 3step. 찾고싶은 이름을 입력받은 후 일치하는 사람이 있다면 몇번째 인덱스에 있는지 알려주기
		// 예: 찾고싶은사람 이름 : 박병관
		// 박병관은 0번째에 존재합니다.

		System.out.print("찾고싶은 이름 : ");
		String searchName = sc.next();

		for (int i = 0; i < names.length; i++) {
			if (searchName.equals(names[i])) {
				System.out.println(searchName + "은" + i + "번째에 존재합니다.");
			}
		}

	}
}
