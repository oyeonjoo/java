package ch07.ex05.case03;

import java.util.ArrayList;

public class MyList {
	public static void main(String[] args) {
		//ArrayList<Integer> list = new ArrayList<Integer>(); �� �� �Ʒ��ξ�������
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1); //����. �츮�� �� ������ ������ Ű�� ������ ��
		list.add(2);
		list.add(3);
		list.add(1);
		
		System.out.println(list);
		
		for(int i: list) System.out.println(i + " ");
		System.out.println();
		
		//Ư�� ���� �ϳ���,  �ε��� �� Ű�� �Է� 
		System.out.println(list.get(0)); //0��°Ű �� �ҷ�����
		
		//���ͷ�����  list.size()�� �����ϴ� ���� ������ ����
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		/*
		 //get�� �����͸� �д°�, ������  ���ٷ��� remove�̿��ϱ�
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.remove(i) + " ");
		*/
	
		//����] remove() list�� ��� ���Ҹ� �����϶�.
		/*
		int size = list.size();
		for(int i = 0; i < size; i++)
			list.remove(0);	
		*/
		for(int i = list.size() - 1; i >= 0; i--)
			list.remove(i);
		System.out.println(list); // �� ����ְ�
		
		
		
	}
}
