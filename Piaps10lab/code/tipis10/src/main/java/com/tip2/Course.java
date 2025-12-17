package com.tip2;

import java.util.*;

public class Course {

	public Collection<Student> students;
	public Instructor instructor; // Изменен на public для демонстрации
	public Department department;
	private int courseId;
	private String title;

	// Конструктор
	public Course(int courseId, String title, Department department) {
		this.courseId = courseId;
		this.title = title;
		this.department = department;
		this.students = new ArrayList<>();
	}

	/**
	 * * @param assignment
	 */
	public void addAssignment(Assignment assignment) {
		// Реализация: добавляет задание в коллекцию департамента, к которому принадлежит курс
		if (assignment != null && department != null) {
			department.assignments.add(assignment);
			System.out.println("-> Курс " + title + " добавил задание '" + assignment.getTitle() + "' в департамент.");
		}
	}

	/**
	 * * @param instructor
	 */
	public void assignInstructor(Instructor instructor) {
		// Реализация: назначает преподавателя
		this.instructor = instructor;
		System.out.println("-> Преподаватель " + instructor.getName() + " назначен на курс: " + title);
	}

	// Геттеры
	public int getCourseId() {
		return courseId;
	}

	public String getTitle() {
		return title;
	}

}