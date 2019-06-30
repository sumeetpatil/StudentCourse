package com.student.course.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.student.course.model.ElectiveCourse;

@RepositoryRestResource(path = "electives", collectionResourceRel = "electives")
public interface ElectiveCourseRepository extends JpaRepository<ElectiveCourse, Long> {
}
