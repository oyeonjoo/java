package ch05.ex03.case01;

public class Main {
	public static void main(String[] args) {
		Tv myTv = new Tv();
				//new�������ɶ�(��ü�������ɶ�) �ڵ����� �ʱ�ȭ ��.
		System.out.println(myTv);
		
		System.out.printf("%s, %b, %d\n",
				myTv.getColor(), myTv.isPower(), myTv.getChannel());
		
		myTv.setColor("red");
		myTv.setPower(true);
		myTv.setChannel(7);
		
		System.out.printf("%s, %b, %s\n",
				myTv.getColor(), myTv.isPower(), myTv.getChannel());
	}
}
