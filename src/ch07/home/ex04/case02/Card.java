package ch07.home.ex04.case02;

public class Card {
	//������ī�带 �ε����� ��������.
	private int num;
	
	public Card(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return this.num + " ";
	}
}
