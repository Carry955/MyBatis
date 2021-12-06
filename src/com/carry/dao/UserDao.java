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
	public List<User> getAll(Map<String, Object> map) throws IOException{
		SqlSession session = MyBatisUtil.getSession();
		List<User> list = session.selectList("com.carry.entity.UserMapper.getUserBuCondition", map);
		session.close();
		return list;
	}
}
