package com.tip2;

public class Person {

	private String name;
	private String email;

	// Конструктор
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	// Геттеры
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getContactInfo() {
		// Реализация: возвращает имя и email
		return "Имя: " + this.name + ", Email: " + this.email;
	}

}