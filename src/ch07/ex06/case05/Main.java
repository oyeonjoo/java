package ch07.ex06.case05;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		Integer[] arr1 = {1, 2, 3}; //Integer�迭
		String[] arr2 = {"a", "b", "c"};
		
		//�޼��� ���Ҷ� ���ʸ�Ÿ�� ����
		int i =box.getLastVal(arr1); //arr1��Ƽ��Ÿ�� �� -> genericŸ�Ե� ��Ƽ����
		String s = box.getLastVal(arr2);
		
		System.out.printf("%d %s", i, s);
	
	}
}
