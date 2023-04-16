package ch03.ex10;

public class C02Final {
	public static void main(String[] args) {
		final int MAX = 3; //final : 이름있는 상수를 만드는 문법이다. 값을 고정해서 바꿀 수 없게 한다. 상수임을 보여주기 위해 대문자로작성.
		// max = 1; 변수를 변경할 수 없다.
		
		double area = 3.14 * 3 * 3;
		
		final double PI = 3.14;
		int r = 3;
		area = PI * r * r;
	}
}
