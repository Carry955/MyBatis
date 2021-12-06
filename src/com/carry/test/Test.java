package com.carry.test;

import java.io.IOException;
import java.util.List;
import com.carry.dao.UserDao;
import com.carry.entity.User;

public class Test {
	public static void main(String[] args) throws IOException {
		UserDao userDao = new UserDao();
		List<User> users = userDao.getPage(1, 3);
		for(User u:users) {
			System.out.println(u);
		}
//		System.out.println(userDao.getById(666));
//		User user = userDao.getById(123);
//		user.setGender("male");
//		System.out.println(userDao.deleteUser(123));
//		List<User> users = userDao.selectAll();
//		for(User u:users) {
//			System.out.println(u);
//		}
	}
}
