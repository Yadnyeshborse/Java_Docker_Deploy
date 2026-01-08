package com.example.Spring.and.Docker.setting.DTO;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;

    private String name;
    private Integer age;
    private String department;

    // Getters and Setters
    public Integer getEmployee_id() { return employee_id; }
    public void setEmployee_id(Integer employee_id) { this.employee_id = employee_id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}
