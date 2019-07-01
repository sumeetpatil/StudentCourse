package com.student.course.projection;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.student.course.model.Course;
import com.student.course.model.Student;

@Projection(name = "enrolmentView", types = Course.class)
public interface EnrollmentProjection {
	Long getId();

	String getStatus();

	Student getStudent();

	Course getCourse();

	Date getEnrollDateTime();
}
