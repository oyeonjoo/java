package ch05.ex08.case04;

public class Deposit {
	private int balance;
	
	public Deposit() {
		//this.balance = 1000; �����ڵ���. �Ʒ��� �����丵�Ѱ�
		this(1000);
	}
	
	public Deposit(int principal) {
		//this.balance = principal; //this.���ñ� ȣ�⹮���� ���� : �ߺ�����
		this(principal, 0); //0������ ������ this.balance = principal + 0�̶�� �����Ҽ��ֱ⶧��
	}
	
	public Deposit(int principal, int interest) {
		this.balance = principal + interest;
	}
	
	public int getBalance() {
		return this.balance;
		//return balance; //�̰ŵ� ����
	}
}
