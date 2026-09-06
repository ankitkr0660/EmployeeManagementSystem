package com.ems.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "EMS_EMPLOYEES")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ems_emp_seq")
	@SequenceGenerator(name = "ems_emp_seq", sequenceName = "EMS_EMP_SEQ", allocationSize = 1)
	private Long id;

	@NotBlank(message = "First name is mandatory")
	@Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
	@Column(name = "first_name", nullable = false)
	private String firstName;

	@NotBlank(message = "Last name is mandatory")
	@Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
	@Column(name = "last_name", nullable = false)
	private String lastName;

	@NotBlank(message = "Email is mandatory")
	@Email(message = "Provide a valid email address")
	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@NotBlank(message = "Department cannot be empty")
	@Column(name = "department", nullable = false)
	private String department;

	public Employee() {
	}

	public Employee(String firstName, String lastName, String email, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.department = department;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}