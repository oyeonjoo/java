package ch05.ex03.case02;

public class Main {
	public static void main(String[] args) {
		Tv tv1 = new Tv(); //tv�� ��.�ּҰ��ٸ�(vm�� �ּҰ�)
		Tv tv2 = new Tv(); //tv�� ��.�ּҰ��ٸ�(vm�� �ּҰ�����)
		
		System.out.printf("%s\n%s\n\n", tv1, tv2);
		System.out.printf("%s\n%s\n\n", tv1.getColor(), tv2.getColor());
		
		tv1.setColor("red");
		System.out.printf("%s\n%s\n\n", tv1.getColor(), tv2.getColor());
		
		tv2 = tv1; //tv1�� tv2�� Ÿ���� ���⶧���� �Ҵ� ����
		System.out.printf("%s\n%s\n\n", tv1, tv2); //tv1�� �����ؼ� tv2�� �־��� ������ �ּҰ���
		System.out.printf("%s\n%s\n\n", tv1.getColor(), tv2.getColor());
	}
}
