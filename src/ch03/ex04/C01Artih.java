package ch03.ex04;

public class C01Artih {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		//byte c = a + b; casting과 할당연산자 등으로 컴파일 에러를 해결하라.
		byte c = (byte)(a + b); // 상수연산자의 리턴 값은 int이다
		System.out.println(c);
		
		//c = c + 1;
		c++;
		System.out.println(c);
		
		double d = a / b; // 계산하는 과정에서 int로 바뀐다. 할당연산자가 실행되기 전에 overflow
		System.out.println(d); // => 버그의 원인 : overflow
		
		//[과제]버그 해결
		d = (double) a / b;
		System.out.println(d);
		d = 1.0 * a / b;
		System.out.println(d);
		// 한가지만 double로 바꿔주면 계산될 때 double로 casting 된다.
		d = (double)(a / b); // 우선순위 떄문에 a/b가 먼저 계산된다. int끼리 계산된다
		System.out.println(d);
		d = a / b * 1.0; // 버그. 이건X
		System.out.println(d);
	}
}
