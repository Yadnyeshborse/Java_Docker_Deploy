package com.example.Spring.and.Docker.setting.Respositery;

import com.example.Spring.and.Docker.setting.DTO.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}