package com.si.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="emp_store")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
//This annotation must be written only on parent class

@DiscriminatorColumn(name ="emp_store",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="Emp")

public class Employee implements Serializable {

	
 private static final long serialVersionUID = 1L;

 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private int employeeId;
	
 private String name;
 private double salary;
 public int getEmployeeId() {
  return employeeId;
 }
 public void setEmployeeId(int employeeId) {
  this.employeeId = employeeId;
 }
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public double getSalary() {
  return salary;
 }
 public void setSalary(double salary) {
  this.salary = salary;
 }}

