package ch07.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> basket =  new Basket <Apple>(); 
		//������Ÿ���� �ٽ��Ͼ��� �� �Ǵ°���!! �׳� �ٱ���X ����ٱ��Ϥ�!!!
		basket.set(new Apple());
		System.out.println(basket.get());
		
		//basket.set(new Grape()); ����ٱ��Ͽ� ����X ����ٱ��Ͽ� SETGRAPE�� �������� �ʴ°���.
		
		//�����ٱ���
		Basket<Grape> basket2 = new Basket<Grape>(); //������ Ȯ�强 ����~
		basket2.set(new Grape());
		System.out.println(basket2.get());
	}
}
