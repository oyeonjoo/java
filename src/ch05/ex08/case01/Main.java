package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		//�ƱⰡ �¾ �� �̸��� ����
		Baby baby = new Baby();//Baby()�� ���� �����߱� ������ ���⼭ �� �� �ִ� ��.
		baby.setName("�ʷ���");
		
		//�¾�鼭���� �̸��� ����
		Baby baby2 = new Baby("ưư��");
	}
}
//�޼ҵ� ���ϴ� �� 3����
// : 1. Ŭ����.�޼���(static�޼���) 2.��ü.�޼���(�ν��Ͻ��޼���) 3.new �޼���(������)