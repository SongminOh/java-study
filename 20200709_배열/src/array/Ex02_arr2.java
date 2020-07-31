package array;

public class Ex02_arr2 {

	public static void main(String[] args) {
		int [] intArray = new int [20];
		//int [] intArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		//int even = 0;
				
		for (int i = 1; i <= 20; i++) {
			if (i%2==0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
// 첫번째 방법
		int[] array = new int[20];
		
		System.out.print("array에 있는 짝수는 : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
			//i가 0일때 --> array[0] = 1
			//i가 1일때 --> array[1] = 2
			if(array[i]%2==0) {			//★★★ i=는 인덱스 번호!
			System.out.print(array[i]+" ");
			//i가 0일때 --> 1이 출력
			//i가 1일때 --> 2가 출력
			}
		}
		System.out.print("입니다.");
		
	System.out.println();
			//두번째 방법
			int array2[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
			System.out.print("array에 있는 짝수는 : ");
			for (int i = 0; i < array2.length; i++) {
				if(array2[i]%2==0) {
					System.out.print(array2[i] + " ");
				}
			}
			System.out.print("입니다.");
		
		
		
		
		
	}

}
