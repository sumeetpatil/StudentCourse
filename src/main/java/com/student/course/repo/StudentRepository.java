package com.student.course.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.student.course.model.Student;

@RepositoryRestResource(path = "students", collectionResourceRel = "students")
public interface StudentRepository extends JpaRepository<Student, Long> {
}
