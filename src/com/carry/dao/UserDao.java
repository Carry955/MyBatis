package com.carry.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.carry.entity.User;

public interface UserDao {
	@Select("select * from test")
	public List<User> getList();
	
	@Insert("insert into test(number, name, age, gender) values(#{number}, #{name}, #{age}, #{gender})")
	public int addUser(User user);
}
