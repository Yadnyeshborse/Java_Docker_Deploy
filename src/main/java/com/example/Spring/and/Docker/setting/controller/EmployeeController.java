package com.example.Spring.and.Docker.setting.controller;


import com.example.Spring.and.Docker.setting.DTO.Employee;
import com.example.Spring.and.Docker.setting.Respositery.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeRepository repository;

    @Autowired
    private EmployeeRepository repo;

    @PostConstruct
    public void test() {
        System.out.println(repo.findAll());
    }


    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        val data=repository.findAll();
        log.info("Fetched Employees: {}", data);
        return data;
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }
}