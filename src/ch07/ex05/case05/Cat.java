package ch07.ex05.case05;

public class Cat {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void eat() { //����̰� �Դ�
		System.out.println(this.name + ", �Դ�."); //�����Դ��� ���ð���
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}