package com.tip2;

import java.util.*;

public class Student extends Person implements Notifiable {

	Collection<Course> courses;
	private int studentId;

	// Конструктор, вызывающий конструктор Person
	public Student(int studentId, String name, String email) {
		super(name, email);
		this.studentId = studentId;
		this.courses = new ArrayList<>();
	}

	/**
	 * * @param course
	 */
	public void enroll(Course course) {
		// Реализация: добавляет курс в коллекцию студента
		if (course != null && !courses.contains(course)) {
			courses.add(course);
			System.out.println("-> Студент " + getName() + " успешно зачислен на курс: " + course.getTitle());
		}
	}

	/**
	 * * @param assignment
	 */
	public void submitAssignment(Assignment assignment) {
		// Реализация: имитирует сдачу задания
		System.out.println("-> Студент " + getName() + " сдал задание: " + assignment.getTitle());
	}

	/**
	 * * @param message
	 */
	@Override
	public void notify(String message) {
		// Реализация: имитирует отправку уведомления
		System.out.println("УВЕДОМЛЕНИЕ СТУДЕНТУ (" + getEmail() + "): " + message);
	}

	// Геттеры
	public int getStudentId() {
		return studentId;
	}

}