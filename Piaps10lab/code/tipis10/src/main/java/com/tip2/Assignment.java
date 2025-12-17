package com.tip2;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Assignment {

	public Department course; // Используем Department, как указано в исходном файле, хотя логичнее было бы Course
	private String title;
	private Date dueDate;

	// Конструктор
	public Assignment(String title, Date dueDate, Department course) {
		this.title = title;
		this.dueDate = dueDate;
		this.course = course;
	}

	public void evaluate() {
		// Реализация: имитирует выставление окончательной оценки
		System.out.println("-> Задание '" + title + "' завершено и оценено.");
	}

	// Геттеры
	public String getTitle() {
		return title;
	}

	public Date getDueDate() {
		return dueDate;
	}
}