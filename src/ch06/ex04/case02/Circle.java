package ch06.ex04.case02;

//��ü�� ���� ���� Ŭ���� �����
public class Circle {
	//���� ��ǥ�� ���ڵ���.
	private int x; //�߽��� ��ǥ
	private int y; //�߽��� ��ǥ
	private int r; //������
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", x, y, r);
	}
	
}