package ch06.home.ex03.case03;

public class User {
	private String name;
	private int age;
	
	//������ �����, �����ڴ� ȣ�������ο����ϱ⶧���� public
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//extends Objcet�� toString�� �������̵��ؾ���. ������ �Ӽ������� �����ϴ°� ����
	@Override
	public String toString() {
		//return name + " " + age + "��"; �Ѵ� ���ɹؿ��� �Ǵٸ� ���!
		return String.format("%s %d��", name, age);
	}
	
	
}
