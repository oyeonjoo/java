package ch09.ex03;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		new Player(counter).start();
		new Player(counter).start(); //�ι�° ����
		new Player(counter).start(); //�������� ���� �þ ���� ī���� �� ���ϰ� �þ. ������ ���輺
		
		
	}
}
