package com.carry.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.carry.entity.User;
import com.carry.util.MyBatisUtil;

public class Test {
	public static void main(String[] args) throws IOException {
		SqlSession sqlSession = MyBatisUtil.getSession();
		User user = sqlSession.selectOne("com.carry.entity.UserMapper.selectUser", 1);
		System.out.println("number:"+user.getNumber()+",name:"+user.getName()+",age:"+user.getAge());
		sqlSession.close();
	}
}
