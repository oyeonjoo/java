package ch06.ex06.case10;

public class Main {
	public static void main(String[] args) {
		BusCard card = new BusCard() {//�� ���� Ŭ������,  buscard��ӹ��� �̸����� Ŭ����,
			@Override
			public void tagOn() {
				System.out.println("tag On");
			}
			
			@Override
			public void tagOff() {
				System.out.println("tag Off");
			}
		}; //�Ҵ翬���� �ٿ�����! //�̸��̾��� Ŭ������ ������ �ѹ��ۿ� ����. newClass�ϸ� ����.
		
		card.tagOn();
		card.tagOff();
	}
}
//�ȵ���̵��� �ڵ���Ÿ��