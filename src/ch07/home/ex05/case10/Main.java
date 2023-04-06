package ch07.home.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Pencil pencil = new Pencil();
		Eraser eraser = new Eraser();
		Bag<Stationery> bag = new Bag<>(); //������ ���� ����
		
		bag.add(pencil);
		bag.add(eraser);
		
		for(Stationery s: bag) {
			if(s instanceof Pencil) ((Pencil)s).write();
			if(s instanceof Eraser) ((Eraser)s).erase();
		}
	}
}
/*
���濡 ���ʰ� ���찳�� ��´�.
���濡�� ������ ������.
���� ������ �����̸� write, ���찳�� �����.
*/