package ch06.ex06.case07;

public class Main {
	public static void main(String[] args) {
		int val = 1;
		
		switch(val) { //�������� ������. 1�� 2�� ���� �����ڴ� �����ؾ���.
		case 1: 
		case 2: 
		}
		
		//CODE�� �ִ� ��� �̷��� �� , ������ ������
		switch(val) {
		case Code.USER_ADD:
		case Code.USER_DEL:
		}
		
	}
}
