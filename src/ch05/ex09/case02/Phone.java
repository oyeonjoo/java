package ch05.ex09.case02;

public class Phone {
	public static int cnt; //���忡�� ���� � ������ ���ž�.
	private int serial; //�ø����� �����ǰ��� �������ϱ� ������ �ν��Ͻ�
						//�׻�����ؾ��ϱ� ������ �ν��Ͻ�(�����ڴ� ���Ҷ��� �ϱ⶧���� �����߻� ��)
	{
		serial = ++cnt * 100;
	}
	
	public Phone() {}
	
	public Phone(int serial) {
		this.serial = serial;
	}
	
	public int getSerial() {
		return this.serial;
	}

}
