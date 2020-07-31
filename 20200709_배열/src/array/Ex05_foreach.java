package array;

public class Ex05_foreach {

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		// for i in [1,2,3,4] :			//py.
		//		print(i)
		for(int i: array) {
			System.out.print(i+" ");
		}
	}

}
