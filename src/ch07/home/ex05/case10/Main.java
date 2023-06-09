package ch07.home.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Pencil pencil = new Pencil();
		Eraser eraser = new Eraser();
		Bag<Stationery> bag = new Bag<>(); //문구를 담은 가방
		
		bag.add(pencil);
		bag.add(eraser);
		
		for(Stationery s: bag) {
			if(s instanceof Pencil) ((Pencil)s).write();
			if(s instanceof Eraser) ((Eraser)s).erase();
		}
	}
}
/*
가방에 연필과 지우개를 담는다.
가방에서 물건을 꺼낸다.
꺼낸 물건이 연필이면 write, 지우개면 지운다.
*/