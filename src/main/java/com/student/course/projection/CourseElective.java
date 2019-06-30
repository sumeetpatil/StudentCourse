package com.student.course.projection;

import org.springframework.data.rest.core.config.Projection;

import com.student.course.model.Course;
import com.student.course.model.ElectiveCourse;

@Projection(name = "courseElective", types = Course.class)
public interface CourseElective {
	ElectiveCourse getElective();

	String getName();

	Long getId();
}
