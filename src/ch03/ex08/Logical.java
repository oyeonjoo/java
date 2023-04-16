package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;
		b = (2 > 1) && (2 > 1); // 비교 먼저 실행. () 없어도 결과는 같으나 ()가 없으면 가독성이 떨어짐.
		b = 2 < 1 && 2 > 1;
		b = 2 < 1 || 2 > 1;
		b = 2 < 1 || 2 < 1;
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y <0; // ++x, ++y 먼저 실행. &&가 속도가 빠르기 때문에 작업속도가 높다. ++x에서 이미 false이기 때문에 && 뒷부분은 실행되지 않는다. y는 초기값 그대로이다.
		
		x = 0;
		y = 0;
		b = ++x < 0 & ++y < 0; // &는 뒷부분까지 전부 실행된다.
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y < 0; // ++x 실행, || 실행, ++y 실행
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y < 0; // 앞부분에 true가 나오면 실행되지 않는다. y는 초기값 그대로이다.
		
		x = 0;
		y = 0;
		b = ++x < 0 | ++y < 0; // |는 뒷부분까지 전부 실행된다.
		
		System.out.printf("x: %d, y: %d, b: %b", x, y, b);
		// &&와 ||가 처리 속도가 빠르다.
	}
}