package com.student.course.repo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.student.course.model.Course;
import com.student.course.model.EnrollStatus;
import com.student.course.model.Enrollment;
import com.student.course.model.Student;

public class EnrollmentRepositoryTest {

	@Mock
	private EnrollmentRepository enrollRepository;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAllToDo() {
		List<Enrollment> enrollments = new ArrayList<Enrollment>();
		enrollments.add(new Enrollment());
		enrollments.add(new Enrollment());
		enrollments.add(new Enrollment());
		when(enrollRepository.findAll()).thenReturn(enrollments);

		List<Enrollment> result = enrollRepository.findAll();
		assertEquals(3, result.size());
	}

	@Test
	public void testGetToDoById() {
		Enrollment enroll = new Enrollment(1L, EnrollStatus.PENDING, new Student(), new Course(), new Date());
		when(enrollRepository.getOne(1L)).thenReturn(enroll);
		Enrollment enroll1 = enrollRepository.getOne(1L);
		assertEquals(1L, enroll1.getId());
		assertEquals(EnrollStatus.PENDING, enroll1.getStatus());
	}

	@Test
	public void testSave() {
		Enrollment enroll = new Enrollment(1L, EnrollStatus.PENDING, new Student(), new Course(), new Date());
		when(enrollRepository.save(enroll)).thenReturn(enroll);
		Enrollment d = enrollRepository.save(enroll);
		assertEquals(1L, d.getId());
		assertEquals(EnrollStatus.PENDING, d.getStatus());
	}

	@Test
	public void removeDepartment() {
		Enrollment enroll = new Enrollment(1L, EnrollStatus.PENDING, new Student(), new Course(), new Date());
		enrollRepository.delete(enroll);
		verify(enrollRepository, times(1)).delete(enroll);
	}
}
