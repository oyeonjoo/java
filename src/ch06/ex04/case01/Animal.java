package ch06.ex04.case01;

public class Animal {
	private String name;
	
	//public Animal() {} //2 CatŬ���� super()���� ���� �ذ�!
	
	//������ ���� (����) Animal�� �⺻������X
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
