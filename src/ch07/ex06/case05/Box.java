package ch07.ex06.case05;

public class Box { //generic method
	//generic <T>, ����Ÿ�� T, �Ķ���� �迭Ÿ��?
	public <T> T getLastVal(T[] arr) {
		return arr[arr.length - 1]; //�Ķ���� �迭�� ������ ���� ����;
	}
}
