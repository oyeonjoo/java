package ch07.ex07.case05;

@FunctionalInterface
public interface Janitor<T> { //û�Һθ� ���ٷ� �����
	void clean(T t); //û�Һκ��� Ŭ����(������) ������ �ֱ� ������ ���ٷ� �����!
}
