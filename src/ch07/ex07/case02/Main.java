package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("Human say.");
		human.say();
		Human.walk();
		//human.walk();
		human.sleep(); // ���ٿ��� default�޼ҵ� ��밡��?
		
		human = new Student();
		human.say();
		//human.walk(); Student�� walk�޼��� ����
		human.sleep();
	}
}
