package com.carry.dao;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.carry.entity.User;
import com.carry.util.MyBatisUtil;

public class UserDao {
	public User getById(int id) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		User user = session.selectOne("com.carry.entity.UserMapper.selectUser", id);
//		System.out.println("number:"+user.getNumber()+",name:"+user.getName()+",age:"+user.getAge());
		session.close();
		return user;
	}
	public List<User> selectAll() throws IOException{
		SqlSession session = MyBatisUtil.getSession();
		List<User> users = session.selectList("com.carry.entity.UserMapper.selectAll");
		session.close();
		return users;
	}
	//分页（通过Map）
	public List<User> selectPage(int currentPage, int pageSize) throws IOException{
		SqlSession session = MyBatisUtil.getSession();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("startIndex", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		List<User> users = session.selectList("com.carry.entity.UserMapper.selectPage", map);
		session.close();
		return users;
	}
	//分页（通过RowBounds）
	public List<User> getPage(int currentPage, int pageSize) throws IOException{
		SqlSession session = MyBatisUtil.getSession();
		RowBounds rowBounds = new RowBounds((currentPage-1)*pageSize, pageSize);
		List<User> users = session.selectList("com.carry.entity.UserMapper.selectAll", null, rowBounds);
		session.close();
		return users;
	}
	public int addUser(User user) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		int result = session.insert("com.carry.entity.UserMapper.addUser", user);
		session.commit();
		session.close();
		return result;
	}
	public int updateUser(User user) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		int result = session.update("com.carry.entity.UserMapper.updateUser", user);
		session.commit();
		session.close();
		return result;
	}
	public int deleteUser(int id) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		int result = session.delete("com.carry.entity.UserMapper.deleteUser", id);
		session.commit();
		session.close();
		return result;
	}
}
