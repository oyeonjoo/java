package ch06.ex06.case03;

//�������̽� ��ӹ��� �� implements. (class����� extends) 
public class Fridge implements Appliance {
	//�������̽� ��ӽ� �������̵尡 ����..?
	@Override
	public void on() {
		System.out.println("����� �Ѵ�.");
	}
	
	@Override
	public void off() {
		System.out.println("����� ����.");
	}
}
