package com.si.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		System.out.println("1");
		
		
		//create one employee
		Employee employee = new Employee();  // object : employee
		employee.setName("John");
		employee.setSalary(5000); 
		em.persist(employee);  // insert
		System.out.println("2");
		
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("Trisha");
		manager.setSalary(8000);
		manager.setDepartmentName("Sales");
		em.persist(manager);   // insert
		
		
		System.out.println("3");
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		em.close();
		factory.close();
	}
}
