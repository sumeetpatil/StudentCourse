package com.student.course.repo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.student.course.model.Course;
import com.student.course.model.Department;
import com.student.course.model.ElectiveCourse;
import com.student.course.model.Semester;

public class CourseRepositoryTest {

	@Mock
	private CourseRepository courseRepo;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAllToDo() {
		List<Course> course = new ArrayList<Course>();
		course.add(new Course(1L, "Test1", new Semester(), new Department(), new ElectiveCourse(), null));
		course.add(new Course(2L, "Test2", new Semester(), new Department(), new ElectiveCourse(), null));
		course.add(new Course(3L, "Test3", new Semester(), new Department(), new ElectiveCourse(), null));
		when(courseRepo.findAll()).thenReturn(course);

		List<Course> result = courseRepo.findAll();
		assertEquals(3, result.size());
	}

	@Test
	public void testGetToDoById() {
		Course course = new Course(1L, "Test1", new Semester(), new Department(), new ElectiveCourse(), null);
		when(courseRepo.getOne(1L)).thenReturn(course);
		Course course1 = courseRepo.getOne(1L);
		assertEquals(1L, course1.getId());
	}

	@Test
	public void testSave() {
		Course course = new Course(1L, "Test1", new Semester(), new Department(), new ElectiveCourse(), null);
		when(courseRepo.save(course)).thenReturn(course);
		Course d = courseRepo.save(course);
		assertEquals(1L, d.getId());
		assertEquals("Test1", d.getName());
	}

	@Test
	public void removeCourse() {
		Course course = new Course(1L, "Test1", new Semester(), new Department(), new ElectiveCourse(), null);
		courseRepo.delete(course);
		verify(courseRepo, times(1)).delete(course);
	}
}
