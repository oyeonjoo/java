package ch07.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		//2��������� �����! ���� 1������
		List<Cat> floor1 = new ArrayList<>();
		List<Cat> floor2 = new ArrayList<>();
		List<List<Cat>> house = new ArrayList<>(); //floor1,2 �����ҷ���!		
		
		//���� ����� �ֱ�
		for(int i = 0; i < 3; i++) {
			floor1.add(new Cat("�����" + i));
			floor2.add(new Cat("�߿���" + i));
		}
		
		System.out.printf("%s\n%s\n", floor1, floor2);
		
		//1��2���� �����
		house.add(floor1);
		house.add(floor2);
		System.out.println(house);
		
		//����] ����� ������������ ���� ���̼���.
		for(List<Cat> floor: house) //house�� floor�� ��ڴ�. cat�� ���� �� �ִ�.
			for(Cat cat: floor) cat.eat();
	} 
}
