package ch02.ex03;

public class C02DoubleInt {
	public static void main(String[] args) {
		double d = 1.42;
		int i = (int)d; 
		System.out.printf("%d, %f\n", i, d);
		
		double f = Math.floor(d); // ����ó��. 1.92�� �ٴ� 1.0,
		double r = Math.round(d); // �ݿø�ó��.
		
		System.out.printf("%f, %f", f, r);
	}
}
