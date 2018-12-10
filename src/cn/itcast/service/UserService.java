package cn.itcast.service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.bean.User;
import cn.itcast.dao.UserDao;

//service��
//�����spring���������

@Transactional
public class UserService {

	 private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void add() {
		System.out.println("service add.....");
		userDao.add(); 
	}
	
}
