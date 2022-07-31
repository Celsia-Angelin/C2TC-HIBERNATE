package com.hb.crud.services;

import com.hb.crud.entities.Student;

public interface StudentService {
	public abstract void addStudent(Student student);
	
	public abstract void updateStudent(Student student);
	
	public abstract void removeStudent(Student student);

public abstract Student findStudentById(int id);
}