package ch05.ex06.case01;

public class Main {

	public static void main(String[] args) {
		Man.say("I love java.");
		// Man.tell() �ν��Ͻ��޼��� ��ü���� ���Ҽ�X
		Man man = new Man(); //��ü���� �������� �ν��Ͻ� �޼��� ���Ҽ� ��
		man.tell("I Love Java");
		man.say("Hello"); //��ü�� static�޼ҵ� ���Ҽ������� ���!! �����ϴ�
 	}
}
