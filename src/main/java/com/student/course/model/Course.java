package com.student.course.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	@Column(unique = true)
	private String name;

	@ManyToOne
	private Semester semester;

	@ManyToOne
	private Department department;

	@ManyToOne
	private ElectiveCourse elective;

	@OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
	private List<Enrollment> enrollment;
}
