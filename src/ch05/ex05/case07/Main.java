package ch05.ex05.case07;

public class Main {
	public static void main(String[] args) { 
		//����� main�� �ҷ��� �ʿ� X
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		
		retailer.sell(farmer.sell(1000));
	}
}
/*
 ��ΰ� ��� ��Ȯ. õ���̶� ������ �ٿ� ������ڿ��� �Ǹ�.
  ������ڴ� ����� 2��� ������ �ٿ� �Ǹ� 
  retailer.sell�� ������
 */