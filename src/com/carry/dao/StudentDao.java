package com.carry.dao;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.carry.entity.Student;
import com.carry.util.MyBatisUtil;

public class StudentDao {
	public List<Student> getAll() throws IOException{
		SqlSession session = MyBatisUtil.getSession();
		List<Student> list = session.selectList("com.carry.entity.StudentMapper.getStudents");
		session.close();
		return list;
	}
}
