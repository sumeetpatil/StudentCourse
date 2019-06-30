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

import com.student.course.model.Department;

public class DepartmentRepositoryTest {

	@Mock
	private DepartmentRepository deptRepository;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAllToDo() {
		List<Department> department = new ArrayList<Department>();
		department.add(new Department(1L, "CSE", null, null));
		department.add(new Department(2L, "MECH", null, null));
		department.add(new Department(3L, "EC", null, null));
		when(deptRepository.findAll()).thenReturn(department);

		List<Department> result = deptRepository.findAll();
		assertEquals(3, result.size());
	}

	@Test
	public void testGetToDoById() {
		Department dept = new Department(1L, "CSE", null, null);
		when(deptRepository.getOne("1")).thenReturn(dept);
		Department dept1 = deptRepository.getOne("1");
		assertEquals(1L, dept1.getId());
	}

	@Test
	public void testSave() {
		Department dept = new Department(1L, "CSE", null, null);
		when(deptRepository.save(dept)).thenReturn(dept);
		Department d = deptRepository.save(dept);
		assertEquals(1L, d.getId());
		assertEquals("CSE", d.getName());
	}

	@Test
	public void removeDepartment() {
		Department dept = new Department(1L, "CSE", null, null);
		deptRepository.delete(dept);
		verify(deptRepository, times(1)).delete(dept);
	}
}
