package ch07.ex06.case03;

public class Cosmos { //���丮 �޼���. ������ �̸��������ϸ� ���ְ� �ٰ���
	public static Animal getAnimal(String animalName) {
		Animal animal = null;
		
		switch(animalName) {
		case "ȣ����": animal = new Tiger(); break;
		case "��": animal = new Falcon();
		}
		
		return animal;
	}
} 
