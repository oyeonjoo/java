package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i; // promotion, �Ҵ翬���ڰ� �����ϴ� �����ʹ� i������ �����͸� �о ���θ���� ����� 1
		System.out.printf("%f, %d\n", d, i); // d�� �Ǽ��ϱ� %f, i�� �����ϱ� %d 
											// d 1.00���� �ٲ� ������? d�� ���� ���� �Ҵ翬���� ������� �� 1.0�� �������.
											// ���� ���� �Ҵ翬���� ������ �б�, ������ ����, i�� �б�, d�� ����
		d = (double)i; // ()�� ĳ���ÿ�����, i������ �� ����x i���� ���� �о ĳ���ÿ����ڰ� doubleŸ������ ������ ���� �Ҵ翬���ڰ� ������.ĳ���ÿ����� ���ϰ� ����
		System.out.printf("%f, %d\n", d, i);
		
		//i = d;
		i = (int)d; // �Ҵ翬���ڴ� ĳ���ÿ������� ���ϰ��� ����.
		System.out.printf("%f, %d\n", d, i);
	}
}
