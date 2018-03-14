package com.bjpowernode.dao;

import org.apache.ibatis.annotations.Insert;

import com.bjpowernode.beans.Student;

public interface IStudentDao {

	@Insert("insert into student(name,age) values(#{name},#{age})")
	void insertStudent(Student student);

}
