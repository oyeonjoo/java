package ch02.ex02;

public class C05SB {
	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("�츮 ���� ");
		
		int len = src.length();
		System.out.println("length : " + len);
		
		src.append("¢�´�."); // �մ´�
		src.replace(3, 4, "�����"); // ���� ����̷� ��ü�Ѵ�.
		
		String str = src.toString(); // StringŸ������ ��ȯ��Ű��.
		
		System.out.println(src); // StringBufferŸ��
		System.out.println(str); // StringŸ��
	}
}