package ch06.ex02.case02;

public class Parent {
	//��������
	private String regNum;
	private String Name;
	private int money;
	
	//getter�� ���
	private String getRegNum() { //�ֹι�ȣ�� private
		return regNum;
	}
	
	public String getName() {
		return Name;
	}
	
	protected int getMoney() { //�ڽĿ��� ���̰� �ϱ� ����.(��� = protected)
		return money;
	}
	
	void addMoney(int money) { //setMoney���� add�Ӵϰ� �� ������ ������� �����
		this.money += money;  //add�Ӵϴ� ����Ʈ
	}
}
