package ch07.ex01.case04;

public class Main {
	public static void main(String[] args) {
		Platanus platanus = new Platanus();
		
		Tree tree = new Platanus(); //������ �ѱ׷� �ֳ�.
		platanus = (Platanus)tree; //�� ������ �ö�Ÿ�������� �˾ƺ�.(ĳ����)
		
		tree = platanus;
		tree = (Tree)platanus;
		
	}
}