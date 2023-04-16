package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		System.out.println(c);
		 
		c = a * b; // int끼리 계산되어서 데이터 타입이 int, c의 값은 int에 담지 못한다
		System.out.println(c); // overflow
		
		c = (long)a * b;
		System.out.println(c);
		
		int x = a * b / a; //overflow. a*b의 값이 이미 overflow됐기 때문.		
		//x = a / a * b;
		//x = a * (b / a);
		x = a / b * a;
		System.out.println(x);
	}
}
