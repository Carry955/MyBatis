package com.carry.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.carry.dao.UserDao;
import com.carry.entity.User;
import com.carry.util.MyBatisUtil;

public class Test {
	public static void main(String[] args) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		UserDao userDao = session.getMapper(UserDao.class);
		User user = new User();
		user.setNumber("123");
		user.setName("carry");
		user.setAge(23);
		user.setGender("male");
		userDao.addUser(user);
		session.close();
	}
}
