package ch07.ex06.case07;

import java.util.List;

public class Pocket {
	{//�ν��Ͻ���
		int i = 1 * 2;
		double d = 1.0 * 2.0;
		i = new Integer(1) + new Integer(2);
		d = new Double(1.0) + new Double(2.0);
	//IntegerŬ������ Number�� ��ӹ���.
	//DoubleŬ������ Number�� ��ӹ���.
	
		//new Number(1) * new Number(2) => Number�� �߻�Ŭ����?���� �Ұ���
	}
	
	//unbounded wildcard
	public void printList(List<?> List) { 
		System.out.println(List);
	}
	
	//upper bounded wildcard
	public double add(List<? extends Number> list) {//���� Ÿ�� double
		double sum = 0;
		//for(Integer i: list) //������ ���� ��. add�� ȣ��ɶ� ������
		//for(Double i: list) //integer������ double�� ���θ��, double�̸� double
		for(Number n: list) sum += n.doubleValue(); //�ѹ�Ÿ���� ���X BUT doublevalue�� ����
		
		return sum;
	}
	
	//lower bounded wildcard ����...
	public List<? super Integer> add2(List<? super Integer> list) {
		return list;
	}
}
