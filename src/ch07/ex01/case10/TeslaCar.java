package ch07.ex01.case10;

public class TeslaCar implements SelfCar {//�ϵ����� ����
	private SelfCar os; //os�� �ʿ���. os���� �����̳������̿ð�
	
	@Override
	public void start() {
		os.start(); //�˰��� ��������X�� ������� �˰��� �̿��� ��.
	}
	
	public void setOS(SelfCar selfCar) {
		this.os = selfCar;
	}
}
