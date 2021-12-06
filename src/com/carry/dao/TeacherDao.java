package com.carry.dao;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.carry.entity.Student;
import com.carry.entity.Teacher;
import com.carry.util.MyBatisUtil;

public class TeacherDao {
	public List<Teacher> getById(int id) throws IOException{
		SqlSession session = MyBatisUtil.getSession();
		List<Teacher> teachers = session.selectList("com.carry.entity.TeacherMapper.getTeacher", id);
		session.close();
		return teachers;
	}
}
