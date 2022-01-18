package com.samcodes.example.demo.repositories;

import com.samcodes.example.demo.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProjectRepo extends JpaRepository<Project, Long> {
}
