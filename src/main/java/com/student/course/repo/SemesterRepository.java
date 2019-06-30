package com.student.course.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.student.course.model.Semester;

@RepositoryRestResource(path = "semesters", collectionResourceRel = "semesters")
public interface SemesterRepository extends JpaRepository<Semester, Long> {
}
