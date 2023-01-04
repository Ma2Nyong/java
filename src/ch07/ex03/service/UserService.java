package ch07.ex03.service;

import ch07.ex03.domain.User;

public interface UserService {
	public User getUser();
	public void addUser(User user);// update. add
	public void fixUser(String userName);//수정하다. fix
	public void delUser();//삭제하다. del
}
// 유저 io의 디펜던시?