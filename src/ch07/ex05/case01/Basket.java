package ch07.ex05.case01;

//generic type
public class Basket <E> { //�ٱ��ϴ� �ƹ��ų� ��ƶ� => "�ƹ��ų�" �ʿ�, �ƹ��ų� Ÿ���� Ŭ����X����ؾ���
	private E e;
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}
