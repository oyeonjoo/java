package ch08.ex03.case01;

public class C02Try {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try { //try�� ������ �߻��ϴ��� ���Ѻ�. exception�߻��� try�������� catch
			int result = arr[10];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		} 
		
		System.out.println("��");
	}
}
