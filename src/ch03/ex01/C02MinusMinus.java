package ch03.ex01;

public class C02MinusMinus {
	public static void main(String[] args) {
		int i = 0;
		--i;
		System.out.println(i);
		i--;
		System.out.println(i);
		
		i = 0;
		int j = --i; // --가 먼저 할당이 나중
		System.out.printf("i: %d, j: %d\n", i, j);
		
		i = 0; // 새로 변수를 만드는 것
		j = i--; // 이미 존재하는 변수를 사용하는 것, 할당이 먼저 --가 나중 
		System.out.printf("i: %d, j: %d\n", i, j);
	}
}
