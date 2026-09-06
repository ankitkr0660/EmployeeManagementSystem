# 🏢 Employee Management System (EMS)

A full-stack, enterprise-grade CRUD web application built using **Spring Boot 3**, **Spring MVC**, **Thymeleaf**, and **Oracle Database**.

---

## 📌 Project Overview
The Employee Management System (EMS) provides an intuitive web interface for managing organizational workforce records. It features complete Create, Read, Update, and Delete (CRUD) operations, data validation, and seamless persistence using Oracle Database.

---

## 🚀 Key Features
- **Interactive UI**: Responsive web layout built with **Bootstrap 5** and **Thymeleaf**.
- **Full CRUD Support**: Add new staff, view the full roster, edit details, and remove records.
- **Data Validation**: Enforced server-side validation using **Jakarta Validation** (name length, mandatory fields, and proper email format).
- **Oracle DB Integration**: Powered by **Spring Data JPA** and **Hibernate 6** with sequence-based auto-incrementing primary keys.
- **Flash Alerts**: Real-time feedback alerts for successful add, update, and delete actions.

---

## 🛠️ Tech Stack
- **Backend**: Java 17, Spring Boot 3, Spring Data JPA, Hibernate 6
- **Frontend**: Thymeleaf, HTML5, CSS3, Bootstrap 5, Bootstrap Icons
- **Database**: Oracle Database (ojdbc8 driver)
- **Architecture**: Model-View-Controller (MVC)
- **Build Tool**: Maven

---

## 📂 Project Architecture

```text
src/main/java/com/ems/
 ├── controller/
 │    └── EmployeeController.java     # Handles web HTTP routes & view dispatching
 ├── model/
 │    └── Employee.java               # JPA Entity mapped to Oracle table EMS_EMPLOYEES
 ├── repository/
 │    └── EmployeeRepository.java     # Data access layer extending JpaRepository
 ├── service/
 │    └── EmployeeService.java        # Business logic layer
 └── EmployeeManagementSystemApplication.java

src/main/resources/
 ├── templates/
 │    ├── index.html                  # Employee directory list
 │    ├── new_employee.html           # Registration form
 │    └── update_employee.html        # Record modification form
 └── application.properties           # Oracle DB connection details
