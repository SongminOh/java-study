package RandomToy;

import java.util.ArrayList;
import java.util.Random;

public class Toy_main {
	public static void main(String[] args) {
		
		
		//���� ���� �̱�
		Random r = new Random();
		//��ĳ����
		Toy ryan = new Toy_ryan();
		Toy peng = new Toy_peng();
		Toy minion = new Toy_minion();
//		//Toy_minion minion2 = new Toy_minion(); 	�굵 �ڵ�����ȯ
		
//		ryan.pick();
//		peng.pick();
//		minion.pick();
				
		int randNum = r.nextInt(3);
//		if(randNum == 0) {
//			ryan.pick();
//		} else if (randNum == 1) {
//			peng.pick();
//		} else if (randNum == 2) {
//			minion.pick();
//		}
		
		ArrayList<Toy> toy_arraylist = new ArrayList<>();
		
		toy_arraylist.add(ryan);
		toy_arraylist.add(peng);
		toy_arraylist.add(minion);
//		//toy_arraylist.add(minion2)
		
		toy_arraylist.get(randNum).pick();
		
		
		
		
		
		
		
		
	}
}
