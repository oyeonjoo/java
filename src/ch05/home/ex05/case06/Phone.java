package ch05.home.ex05.case06;

public class Phone { //�Ｚ. �鸸�� ��ġ �� ���� = ������� ��, ��ġx = �������x 
	private String makerName; //maker X => phone has a maker�� �̻�. 
	private int price;
	
	public void sendMsg() {}
	public void call() {}
	public void playGame() {} //�޼��� �̸��� ����
	
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//Getter�� Setter => Getter����.
}
