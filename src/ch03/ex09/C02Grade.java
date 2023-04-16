package ch03.ex09;

public class C02Grade {
	public static void main(String[] args) {
		int score = 50;
		char grade = score >= 90 ? 'A' : (score >= 80 ? 'B' : 'C'); // 코드를 전부 실행하지 않고 건너뛰기가 가능하다.
		System.out.println(grade);
	}
}