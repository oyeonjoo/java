package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a";
		b = s == "a";
		
		s = new String("a"); //���߿� 5�� Ŭ���� �κе��� new ��� ��.
		b = s == "a"; //string�� ���("")�� ��������� new�� ���������.
		
		b = s.equals("a"); //���ڰ� �� (���ڴ� ==���) , ������� new������ ���X ������ �� "a"�� ������ true, �ٸ���false 
		
		System.out.println(b);
	}
}
