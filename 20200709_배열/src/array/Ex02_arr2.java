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
		
// ù��° ���
		int[] array = new int[20];
		
		System.out.print("array�� �ִ� ¦���� : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
			//i�� 0�϶� --> array[0] = 1
			//i�� 1�϶� --> array[1] = 2
			if(array[i]%2==0) {			//�ڡڡ� i=�� �ε��� ��ȣ!
			System.out.print(array[i]+" ");
			//i�� 0�϶� --> 1�� ���
			//i�� 1�϶� --> 2�� ���
			}
		}
		System.out.print("�Դϴ�.");
		
	System.out.println();
			//�ι�° ���
			int array2[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
			System.out.print("array�� �ִ� ¦���� : ");
			for (int i = 0; i < array2.length; i++) {
				if(array2[i]%2==0) {
					System.out.print(array2[i] + " ");
				}
			}
			System.out.print("�Դϴ�.");
		
		
		
		
		
	}

}
