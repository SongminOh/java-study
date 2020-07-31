package array;

public class Ex01_arr1 {

	public static void main(String[] args) {

		//배열 만드는 방법
		//1. 자료형 써주기	2.변수명 써주기   	3.배열의 의미인 대괄호 써주기[]
		//4. new 키워드쓰기		5.똑같은 자료형 써주기		6.대괄호로 [크기ea] 설정
		//2번과 3번은 바뀌어도 무관합니다.
		int array[] = new int[5];
		System.out.println(array);
		
		int num = 0;
		array[num] = 10;	//0번지는 = 10;
		System.out.println(array[0]);
		
		array[1] = 5;
		System.out.println(array[1]);
		array[2] = 1;
		System.out.println(array[2]);
		array[3] = 4;
		System.out.println(array[3]);
		array[4] = 14;
		System.out.println(array[4]);
		
System.out.println("======");
		
		for(int i = 0; i<=4; i++) {				//5값 있으면 4번지까지(index는 0번지부터시작)
			System.out.print(array[i] + " ");
		}

System.out.println();
		
		// 바로 생성
		
		///1. 자료형 써주기	2.변수명 써주기   	3.배열의 의미인 대괄호 써주기[]
		//3번까지는 동일		4. ={값1값2,값3,...}
		//단, 타입은 1번에서 설정한 타입과 동일한 값을 작성
		int[] array2 = {5,10,2,3,1,3,5,76,7,8345,2134,123};
		
		for (int i = 0; i <=11; i++) {
			System.out.println(array2[i]);
		}
		
		System.out.println("array2의 길이: " + array2.length);
		System.out.println("array2의 길이: " + (array2.length-1) );
		
		//length 속성	 --> py len(array)과 유사. 배열의 길이를 알려줌
		//array2의 길이: 12개
		for (int i = 0; i < array2.length; i++) {		//i <= array2.length -1
			System.out.println(array2[i]);
		}
		
		
		
		
	}

}
