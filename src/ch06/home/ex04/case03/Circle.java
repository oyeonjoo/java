package ch06.home.ex04.case03;

public class Circle { //A has a B�� Ǯ��
	private Point point; //�����ʱ�ȭ�� ������ �ƴ� �����ڿ���
	private int r;
	
	public Circle(Point point, int r) {
		//this.point = new Point(x, y); Circle(int x, int y, int r)�� ����!
		this.point = point; //Point point�� ����!
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", this.point, this.r);
	}
}