package com.carry.test;

import java.io.IOException;
import java.util.List;
import com.carry.dao.TeacherDao;
import com.carry.entity.Student;
import com.carry.entity.Teacher;

public class Test {
	public static void main(String[] args) throws IOException {
		TeacherDao teacherDao = new TeacherDao();
		List<Teacher> teachers = teacherDao.getById(1);
		for(Teacher tea:teachers) {
			System.out.println(tea);
			for(Student stu:tea.getStudents()) {
				System.out.println(stu);
			}
		}
	}
}
