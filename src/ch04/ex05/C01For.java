package ch04.ex05;

public class C01For {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		
		int i = 0;
		while(i < 10) {//i�� �����ų�� ���ɾ����� while. 
			System.out.print(i + " ");
			i++;
		}
		/*
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//����] i=1�� ��Ȳ���� 0�̻� 9���ϸ� ����϶�.
		for(int i = 1; i <= 10; i++ ) {
			System.out.print( i - 1 + " ");
		}
		System.out.println();
		*/
	}
}
