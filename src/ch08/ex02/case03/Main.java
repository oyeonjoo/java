package ch08.ex02.case03;

public class Main { //name, ordinal, values, valueof 4���� �޼ҵ� ����
	public static void main(String[] args) {
		String name = Way.LEFT.name();
		int ordinal = Way.LEFT.ordinal();//LEFT�� �ڵ尪 0
		name = Way.RIGHT.name();
		ordinal = Way.RIGHT.ordinal(); //�ڵ尪 1
		
		System.out.printf("%s %d\n", name, ordinal);
		
		Way[] ways = Way.values(); //left�� right�ΰ��� ���� ����ִ� �迭�� ���ϵ�
		for(Way way: ways) System.out.print(way.toString() + " ");
		System.out.println();	//��print�޼ҵ�� way��ü�� � �޼ҵ带 ��������?->toString()ȣ����
		
		Way way = Way.valueOf("LEFT");
		System.out.println(way); //println�� way��ü�� � �޼ҵ带 ��������? -> toString()ȣ��
	}	
}
