package ch07.ex07.case01;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("hello");//say�޼��尡 human�� ����, say�޼��尡 HUMANŸ���̴ϱ�
		human.say();
	}
}
