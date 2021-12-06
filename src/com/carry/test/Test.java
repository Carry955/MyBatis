package com.carry.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.carry.dao.UserDao;
import com.carry.entity.User;

public class Test {
	public static void main(String[] args) throws IOException {
		UserDao userDao = new UserDao();
		Map<String, Object> map =new HashMap<String, Object>();
		map.put("name", "c");
		map.put("number", 5);
		List<User> users = userDao.getAll(map);
		for(User u:users) {
			System.out.println(u);
		}
	}
}
