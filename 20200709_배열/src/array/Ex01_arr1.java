package array;

public class Ex01_arr1 {

	public static void main(String[] args) {

		//�迭 ����� ���
		//1. �ڷ��� ���ֱ�	2.������ ���ֱ�   	3.�迭�� �ǹ��� ���ȣ ���ֱ�[]
		//4. new Ű���徲��		5.�Ȱ��� �ڷ��� ���ֱ�		6.���ȣ�� [ũ��ea] ����
		//2���� 3���� �ٲ� �����մϴ�.
		int array[] = new int[5];
		System.out.println(array);
		
		int num = 0;
		array[num] = 10;	//0������ = 10;
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
		
		for(int i = 0; i<=4; i++) {				//5�� ������ 4��������(index�� 0�������ͽ���)
			System.out.print(array[i] + " ");
		}

System.out.println();
		
		// �ٷ� ����
		
		///1. �ڷ��� ���ֱ�	2.������ ���ֱ�   	3.�迭�� �ǹ��� ���ȣ ���ֱ�[]
		//3�������� ����		4. ={��1��2,��3,...}
		//��, Ÿ���� 1������ ������ Ÿ�԰� ������ ���� �ۼ�
		int[] array2 = {5,10,2,3,1,3,5,76,7,8345,2134,123};
		
		for (int i = 0; i <=11; i++) {
			System.out.println(array2[i]);
		}
		
		System.out.println("array2�� ����: " + array2.length);
		System.out.println("array2�� ����: " + (array2.length-1) );
		
		//length �Ӽ�	 --> py len(array)�� ����. �迭�� ���̸� �˷���
		//array2�� ����: 12��
		for (int i = 0; i < array2.length; i++) {		//i <= array2.length -1
			System.out.println(array2[i]);
		}
		
		
		
		
	}

}
