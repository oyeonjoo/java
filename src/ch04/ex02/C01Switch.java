package ch04.ex02;

public class C01Switch {
	public static void main(String[] args) {
		int grade = 3;
		String coupon = "";
		
		switch(grade) {
		case 3: coupon += "10,000원 "; // case 3: 은 grade 변수와 비교할 상수, ex) grade == 3.
		case 2: coupon += "5,000원 ";
		case 1: coupon += "1,000원 ";
		}
		
		System.out.println(coupon);
	}
}