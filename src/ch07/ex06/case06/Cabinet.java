package ch07.ex06.case06;

				//���ʸ�Ÿ�� ���� : AŬ�������, A����Ÿ��
public class Cabinet<T extends A> { //ĳ��ݿ� �������� ���ʸ�Ÿ������
	public T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
	
	public <S extends C> S getFinalVal(S[] arr) {
		return arr[arr.length - 1];
	}
	
	

}
