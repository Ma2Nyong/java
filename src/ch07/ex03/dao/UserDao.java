package ch07.ex03.dao;

import ch07.ex03.domain.User;

public interface UserDao {
	public User selectUser();
	public void insertUser(User user); //crate
	public void updateUser(String userName); //update
	public void deleteUser(); //delete
}
