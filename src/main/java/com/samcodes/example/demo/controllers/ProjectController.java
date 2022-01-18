package com.samcodes.example.demo.controllers;

import com.samcodes.example.demo.models.Employee;
import com.samcodes.example.demo.models.Project;
import com.samcodes.example.demo.repositories.EmployeeRepo;
import com.samcodes.example.demo.repositories.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {

    @Autowired
    ProjectRepo projectRepo;

    @GetMapping(value = "/projects")
    public List<Project> getAllEmployees(){
        return projectRepo.findAll();
    }

    @GetMapping(value = "/projects/{id}")
    public Optional<Project> getEmployee(@PathVariable Long id){
        return projectRepo.findById(id);
    }
}
