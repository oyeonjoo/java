package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a"; // 상수값은 == 를 사용한다.
		b = s == "a";
		
		s = new String("a"); // new 문자열은 == 를 사용할 수 없다. 비교할 수가 없다. 나중에 5장 클래스 부분들어가면 new 배울 것.
		b = s == "a"; //string이 상수("")로 만들어졌냐 new로 만들어졌냐.
		
		b = s.equals("a"); // 문자열은 equals 시용, 숫자는 == 사용 , 상수인지 new인지는 상관X 논리적인 값 "a"가 같으면 true, 다르면 false 
		
		System.out.println(b);
	}
}
