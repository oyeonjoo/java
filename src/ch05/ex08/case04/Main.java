package ch05.ex08.case04;

public class Main {
	public static void main(String[] args) {
		Deposit deposit = new Deposit();
		deposit = new Deposit(2000); //2õ����
		//deposit = new Deposit(2000, 1000); //���� 2õ, ���� õ��
		
		System.out.println(deposit.getBalance());
	}
}
