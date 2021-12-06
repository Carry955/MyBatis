package com.carry.test;

import java.io.IOException;
import java.util.List;
import com.carry.dao.StudentDao;
import com.carry.entity.Student;

public class Test {
	public static void main(String[] args) throws IOException {
		StudentDao studentDao = new StudentDao();
		List<Student> students = studentDao.getAll();
		for(Student stu:students) {
			System.out.println(stu);
			System.out.println(stu.getTeacher());
		}
	}
}
