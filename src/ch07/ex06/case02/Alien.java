package ch07.ex06.case02;

public class Alien extends Life{//�ܰ����� ����ü�̴�.
	//@Override static�޼���� ��ӵ���X, Override X, Override�� �����������
	public static void eat() {
		System.out.println("Alien �Դ�.");
	}
	
	@Override
	public void shout() {
		System.out.println("Alien �Ҹ�ġ��.");
	}

}
