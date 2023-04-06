package ch07.ex02;

import ch07.ex02.dao.UserDao;
import ch07.ex02.dao.UserDaoImpl;
import ch07.ex02.presentation.Console;
import ch07.ex02.presentation.UserIo;
import ch07.ex02.service.UserService;
import ch07.ex02.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		//��ü�鰣 ���踦 ����. �̰��� ��!
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao); //���񽺿� dao�� ����. has a����
		UserIo userIo = new UserIo(userService);// has a����
		
		Console.info("����");
		userIo.play();
		Console.info("��");
	}
} //domain�� �������� x domain�� �׳� ��������!!
