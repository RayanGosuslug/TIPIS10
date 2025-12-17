package com.tip2;

public class Instructor extends Person {

	private int instructorId;

	// Конструктор, вызывающий конструктор Person
	public Instructor(int instructorId, String name, String email) {
		super(name, email);
		this.instructorId = instructorId;
	}

	/**
	 * * @param assignment
	 */
	public void gradeAssignment(Assignment assignment) {
		// Реализация: имитирует проверку и выставление оценки
		System.out.println("-> Преподаватель " + getName() + " проверил задание: " + assignment.getTitle());
	}

	// Геттер
	public int getInstructorId() {
		return instructorId;
	}
}