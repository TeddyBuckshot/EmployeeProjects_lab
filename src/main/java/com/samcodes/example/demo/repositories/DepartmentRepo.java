package com.samcodes.example.demo.repositories;

import com.samcodes.example.demo.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {
}
