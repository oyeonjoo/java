package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
	int x = 10; //decimal 10진수
	System.out.println(Integer.toBinaryString(x)); // 2진수로 변환해준다, (리턴)타입은 String
	
	x = 012; // octal 8진수, 컴파일러에게 8진수임을 알리기 위해 슛자 맨앞에 0을 입력한다. ex) 012: 8진수, 12: 10진수
	System.out.println(Integer.toBinaryString(x));
	
	x = 0xA; // hexa 16진수 
	System.out.println(Integer.toBinaryString(x));
	
	x = 0b1010; // binary 2진수
	System.out.println(Integer.toBinaryString(x));
	
	x = 1_234_567; // 자릿수 구분용으로 ,이 아닌 _을 사용한다. 리터럴에도 사용가능하다.
	System.out.println(x + 1);
	
	double y = 1e1; // 10의 1제곱(1 * 10의 1승) , 지수로 나타낼땐 double사용
	System.out.println(y);
	}
}
