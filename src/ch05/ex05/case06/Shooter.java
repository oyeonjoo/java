package ch05.ex05.case06;

public class Shooter {
	//�����̰� ���� ���� �ִ�. 
	private Gun gun; //dependency 
	
	public void fire() { //�����̰� ���� ���. �׷��� �����̰� ��°� x 
		gun.fire(); //�ѿ� �����Ѵ�. has a ���迡�� A�� B�� ����(����Ѵ�.)
	}

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
//Shooter has a gunǥ���ϱ� 