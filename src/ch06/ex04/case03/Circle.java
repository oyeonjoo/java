package ch06.ex04.case03;

public class Circle extends Point { //�����ڵ�. why? ���� ���̴�.�� �����.
	//private int x; point���� �ߺ�
	//private int y; point�� �ߺ�.
	private int r;
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	//Circle�� �������̶� �������̵� �Ѵ�..?
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", this.getX(), this.getY(),r);
		//return String.format("(%d, %d), %d", x, y); x,y,�ȵǴ� ���� : private
	}
	
}
