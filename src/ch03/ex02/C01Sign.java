package ch03.ex02;

public class C01Sign {
	public static void main(String[] args) {
		//부호연산자
		int i = -10;
		i = +i; // +는 곱하기 1이다. i변수의 값 -10을 읽어서 *1을 하는 것 > -10 리턴하여 i에 저장
		System.out.println(i);
		
		i = -10;
		i = -i; // -는 곱하기 -1이다. 음수를 나타내는 부호연산자, i변수의 값 -10 * -1 = 10 > 양수 10을 리턴
		System.out.println(i);
	}
}
