package ch07.ex02.service;

import ch07.ex02.dao.UserDao;
import ch07.ex02.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao; // member변수의 타입은 interface를 쓴다.
	
	public UserServiceImpl(UserDao userDao) { // DI(Dependency Injection)
		this.userDao = userDao;
	}

	@Override
	public User getUser() {
		return userDao.selectUser();
	}
}
