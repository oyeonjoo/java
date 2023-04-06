package ch02.ex02;

public class C03Str {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum); // 숫자6
		
		String sumStr = "" + sum; // int를 String으로 바꾸기, 문자6
		System.out.println(sumStr);
		
		String s = ""+ (a + b);
		//String s = a + b + "";
		System.out.println(s);
		
		s = "" + a + b; // 배열 위치에 따라서 값이 달라진다.
		System.out.println(s);
		
		String dialog = "John said, \"hello\""; // 큰따옴표를 특수문자를 일반문자로 바꿀려면 앞에 ""앞에 \를 붙이기 : \\사용하기
		System.out.println(dialog);
	}
}
