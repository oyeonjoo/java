package ch07.ex05.case07;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, User> map = new HashMap<>();//���ʸ�Ÿ�� ��Ƽ�� ���� ����.
	
		map.put(1, new User("���Ѽ�")); //ù��° �Ķ���ʹ� Ű, �ι�°�� ����
		map.put(2, new User("�ѾƸ�"));
		map.put(3, new User("�����"));
		System.out.println(map); //Ű�� �������ڿ�
		
		//�Ѽ��̸� �а������
		User user = map.get(1); //1��Ű 
		System.out.println(user);
		System.out.println(map); //�ʾȿ� �Ѽ��� ������
		
		//�ʾȿ��� �Ѽ��� ������
		user = map.remove(1); //1��Ű => �Ѽ��� ����
		System.out.println(map);
	}
}
