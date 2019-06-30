package com.student.course.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.student.course.model.Enrollment;

@RepositoryRestResource(path = "enrollments", collectionResourceRel = "enrollments")
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
