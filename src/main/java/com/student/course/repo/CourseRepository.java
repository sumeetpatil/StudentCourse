package com.student.course.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.student.course.model.Course;
import com.student.course.projection.CourseElective;

@RepositoryRestResource(path = "courses", collectionResourceRel = "courses", excerptProjection = CourseElective.class)
public interface CourseRepository extends JpaRepository<Course, Long> {
	List<Course> findByDepartmentIdAndSemesterId(long departmentId, long semesterId);
}
