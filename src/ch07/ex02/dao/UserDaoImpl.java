package ch07.ex02.dao;

import ch07.ex02.domain.User;

//UserDao �ڽĿ��� �̸� �ڿ� Impl���̱� (���)
public class UserDaoImpl implements UserDao {
	@Override 
	public User selectUser() {
		return new User("���Ѽ�");
	}
	
}
