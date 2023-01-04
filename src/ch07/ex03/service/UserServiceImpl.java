package ch07.ex03.service;

import ch07.ex03.dao.UserDao;
import ch07.ex03.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User getUser() {
		return userDao.selectUser();
	}
	
	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
	} // 디펜던시를 이용한다. 수정할때도
	
	@Override
	public void fixUser(String userName) {
		userDao.updateUser(userName);
	}
	
	@Override
	public void delUser() {
		userDao.deleteUser();
	}
}
