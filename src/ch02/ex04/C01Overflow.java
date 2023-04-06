package ch02.ex04;

public class C01Overflow {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; // byte -> int promotion, casting
		i = (int)b; // casting, promotion 
		System.out.println(i); // promotion(큰 크기의 타입 ← 작은 크기의 타입) 되는 거는 Overflow발생 x, 자동타입변환
		
		// overflow발생하는 경우
		int i2 = 300;
		byte b2 = (byte)i2; // i2를 byte 캐스팅연산자 사용 캐스팅리턴값을 복사해서 b2에 넣음. casting(큰 크기의 타입 → 작은 크기의 타입) 강제타입변환
		System.out.println(b2); // 300 > 44 변질된 현상 : overflow
	}
}
