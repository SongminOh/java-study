
public class Store_main {
	public static void main(String[] args) {
		
		//��ĳ���� �ٿ�ĳ������ �Ǳ� ���ؼ� -��Ӱ��� or �������̽������� Ȯ��� ���̿��� ��
		
		ParentsStore ps = new ParentsStore();
		ps.makeSuta();
		System.out.println("=======================================");
		
		ChildStore cs = new ChildStore();
		cs.makeSuta();
		cs.makeGGua();
		
		System.out.println("=======================================");
		
		//��ĳ����
		//����Ŭ����(�ڽ�Ŭ����)�� ����Ŭ����(�θ�Ŭ����)�� �ڵ� Ÿ�Ժ�ȯ �Ǵ� �� 
		//����Ŭ������ �ʵ�� �޼ҵ忡 ���ٰ���
		
		//�� ����Ŭ������ �������̵� �� ��� �������̵� �� �޼ҵ带 ȣ��
		ParentsStore ps2 = new ChildStore();	//subŬ������ superŬ����ȭ��
		ps2.makeSuta();
		//����Ŭ������ Ȯ���� �޼ҵ�� ��� ����
		//ps2.makeGGua() --> �ȵ�
		
		
		//�ٿ�ĳ����
		//����Ŭ������ ����Ŭ������ "����"����ȯ
//		ChildStore cs2 = (ChildStore) new ParentsStore();
//		
//		cs2.makeSuta();
//		cs2.makeGGua();
//		�� �ڵ�� �߸��� �ڵ�μ� �ȵǴ� �� �Դϴ�. �ٿ�ĳ������ ������ ����ġ �մϴ�.
		
		ChildStore cs2 = new ChildStore();
		cs2 = (ChildStore) ps2;
		cs2.makeGGua();
		cs2.makeSuta();
		
		
		
		
		
	}
}
