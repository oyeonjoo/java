package ch07.ex02.presentation;

import ch07.ex02.service.UserService;

public class UserIo { //userpresentation�ε� �ѱ� ����~
	//service�� ������ �����ϰ�.... �ֿܼ� ���....�Ϸ���.. ���񽺰� �ʿ��ϴ�...
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService; //DI : dependency Injection
	}
	
	public void play() {
		Console.info(userService.getUser());
	}
	//����Io�� ����. ���������� �ٽ� ��������X, �׳� �ֿܼ� ��¸� �Ұž�

}
