package com.student.course.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.student.course.model.Department;

@RepositoryRestResource(path = "departments", collectionResourceRel = "departments")
public interface DepartmentRepository extends JpaRepository<Department, String> {
}
