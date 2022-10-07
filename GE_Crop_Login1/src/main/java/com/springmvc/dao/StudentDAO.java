package com.springmvc.dao;

import com.springmvc.model.Student;

public interface StudentDAO {

	public void registerStudent(Student student);

	public Student loginStudent(Student student);
}
