package ch08.ex03.case01;

public class C05Hirearchy {
	public static void main(String[] args) {
		try {
			int i = 3 / 0;
		} catch(ArithmeticException e) {
			System.err.println("ArithmeticException�� �߻��߽��ϴ�.");
		} catch(Exception e) {
			System.err.println("Exception�� �߻��߽��ϴ�.");
		}
	}
}
