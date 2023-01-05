package ch07.ex03.service;

import ch07.ex03.domain.User;

public interface UserService {
	public User getUser();
	public void addUser(User user);//
	public void fixUser(String userName);//수정하다. fix
	public void delUser();//삭제하다. del
}
// 유저 io의 디펜던시?
// 현장에서는 회원등급을 올린다던지, 경품을 지급한다던지,