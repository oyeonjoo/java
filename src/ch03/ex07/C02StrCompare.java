package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a"; // ������� == �� ����Ѵ�.
		b = s == "a";
		
		s = new String("a"); // new ���ڿ��� == �� ����� �� ����. ���� ���� ����. ���߿� 5�� Ŭ���� �κе��� new ��� ��.
		b = s == "a"; //string�� ���("")�� ��������� new�� ���������.
		
		b = s.equals("a"); // ���ڿ��� equals �ÿ�, ���ڴ� == ��� , ������� new������ ���X ������ �� "a"�� ������ true, �ٸ��� false 
		
		System.out.println(b);
	}
}
