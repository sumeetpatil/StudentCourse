package com.student.course.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.student.course.model.Enrollment;
import com.student.course.projection.EnrollmentProjection;

@RepositoryRestResource(path = "enrollments", collectionResourceRel = "enrollments", excerptProjection = EnrollmentProjection.class)
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
	List<Enrollment> findByStudentId(long studentId);
}
