package com.hb.crud.client;

import com.hb.crud.entities.Student;
import com.hb.crud.services.StudentService;
import com.hb.crud.services.StudentServiceImp;

public class Client {
	public static void main(String[] args) {
		//Debug this program as Debug -> Debug as Java Application
		
		StudentService service = new StudentServiceImp();
		
		Student student = new Student();
		
		// Create Operation
				student.setStudentId(3);
				student.setName("Ram");
		        service.addStudent(student);
		       

//at this breakpoint, we have added one record to table
		// Retrieve Operation
		
				//student = service.findStudentById(2);
		//System.out.print("ID:"+student.getStudentId());
				//System.out.println(" Name:"+student.getName());

		// Update Operation
				//student = service.findStudentById(3);
			   // student.setName("Jimin");
				//service.updateStudent(student);
		
//at this breakpoint, we have updated record added in first section

				//student = service.findStudentById(3);
				//System.out.print("ID:"+student.getStudentId());
				//System.out.println(" Name:"+student.getName());

//at this breakpoint, record is removed from table
		// Delete Operation
				//student = service.findStudentById(3);
				//service.removeStudent(student);
		        // System.out.println("End of program/Life cycle completed...");

   }
}
