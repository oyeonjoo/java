package ch06.ex04.case01;

public class Cat extends Animal {
	//�����Ͽ��� ���� ; CatŬ������ �⺻������.(�ƹ� �����ڵ� �ۼ����� �ʾұ⶧����,)
	//�� �� ������ �ʿ��� ������ �� ���̴�.
	/*
	1 public Cat() { //�ذ��ϱ� ���� : �ڽ�Ŭ���� ù��° ������ ù�ٿ���superȣ���ؾ���! (�θ�������� ������ ȣ��)
		2//super(); //�θ������ ȣ��, this()�� �� ������
		3 super("���ڹ�"); //animal��Ʈ��ȣ���ϴ� ��. �⺻������ �߰� ���ϰ� �̷��� �ذ��ص� ��.	
	}
	 */
	private int age;
	public Cat(String name, int age) {
		super(name); //�θ� �θ� �ʱ�ȭ��^^ name�� animal���� �ʱ�ȭ...
		//this.name = name; name�� private�̱⶧���� ����
		this.age = age; //������ ���� �ʱ�ȭ��^^
	}
	
	public int getAge() {
		return this.age;
	}

	
}
