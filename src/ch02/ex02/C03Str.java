package ch02.ex02;

public class C03Str {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum); // ����6
		
		String sumStr = "" + sum; // int�� String���� �ٲٱ�, ����6
		System.out.println(sumStr);
		
		String s = ""+ (a + b);
		//String s = a + b + "";
		System.out.println(s);
		
		s = "" + a + b; // �迭 ��ġ�� ���� ���� �޶�����.
		System.out.println(s);
		
		String dialog = "John said, \"hello\""; // ū����ǥ�� Ư�����ڸ� �Ϲݹ��ڷ� �ٲܷ��� �տ� ""�տ� \�� ���̱� : \\����ϱ�
		System.out.println(dialog);
	}
}
