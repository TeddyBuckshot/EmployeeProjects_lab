package com.samcodes.example.demo.controllers;

import com.samcodes.example.demo.models.Department;
import com.samcodes.example.demo.repositories.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentRepo departmentRepo;

    @GetMapping(value = "/departments")
    public List<Department> getAllDepartments(){
        return departmentRepo.findAll();
    }

    @GetMapping(value = "/departments/{id}")
    public Optional<Department> getDepartment(@PathVariable Long id){
        return departmentRepo.findById(id);
    }
}
