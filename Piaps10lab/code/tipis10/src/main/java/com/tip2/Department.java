package com.tip2;

import java.util.*;

public class Department {

	public Collection<Course> courses;
	public Collection<Assignment> assignments; // Добавлен public для доступа из Main
	private String name;

	// Конструктор
	public Department(String name) {
		this.name = name;
		this.courses = new ArrayList<>();
		this.assignments = new ArrayList<>();
	}

	/**
	 * * @param course
	 */
	public void addCourse(Course course) {
		// Реализация: добавляет курс в коллекцию департамента
		if (course != null && !courses.contains(course)) {
			courses.add(course);
			System.out.println("-> Департамент " + name + " добавил курс: " + course.getTitle());
		}
	}

	// Геттер
	public String getName() {
		return name;
	}

}