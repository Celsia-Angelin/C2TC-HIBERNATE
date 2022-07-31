package com.oto.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.oto.entities.Address;
import com.oto.entities.Student;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Student student = new Student();
		student.setName("Rachel Jeon");
		Address homeAddress = new Address();
		homeAddress.setStreet("Street style");
		homeAddress.setCity("Tirunelveli");
		homeAddress.setState("Tamil Nadu");
		homeAddress.setZipCode("600 004");
		
		//inject address into student
		student.setAddress(homeAddress);
		
		//persist only student, no need to persist Address explicitly
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		em.close();
		factory.close();
	}
}