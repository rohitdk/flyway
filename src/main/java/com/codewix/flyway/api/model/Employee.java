package com.codewix.flyway.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE_REGISTRATION")
public class Employee {
	@Id
	@GeneratedValue
	private int employeeId;
	private String employeeName;
	private String email;
	private String mobile;
}
