package com.hb.crud.services;

import com.hb.crud.dao.StudentDao;
import com.hb.crud.dao.StudentDaoImp;
import com.hb.crud.entities.Student;

public class StudentServiceImp implements StudentService {
	private StudentDao dao;
	
	public StudentServiceImp()
{

dao = new StudentDaoImp();
}
	
	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}
	
	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}
	
	@Override
	public void removeStudent(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}
	@Override
	public Student findStudentById(int id) {
		//no need of transaction, as it's an read operation
		Student student = dao.getStudentById(id);
		return student;
}
}