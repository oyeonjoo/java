package ch05.ex01.case03;

public class User {
	private String name; //new user�ϸ� name�� ���� ����
	private int age;
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	//�޼ҵ� ����� //�޼ҵ� �̸� : ����� ����
	//setter
	public void setName(String name) { //{}�ȿ� ��ü. ������ ���ؾ��� �� �� ����.
		this.name = name; // �� name name�� ���������ϱ� ���ÿ� ����.
	    //�ϴû� name�� ����������� ��Ÿ���� ���� this����
	}
	
	public void setAge(int age) {//�����set
		this.age = age; //�������age�� �Ķ����age�� �Ҵ�Ǿ� ����.
	}
	
	//����. ���⸻�� �б⵵ �ִ�. return���� �־����.
	//���ϰ��� ������ void�� �ۼ�.���ϰ��� ������ ���ϰ� Ÿ���� �������. �б�� get
	
	//getter
	public String getName() {
		return this.name; //name������ ���� �����Ѵ�.
	}
	
	public int getAge() {
		return this.age;
	}
	*/
} //setter getter�� �а�������.
