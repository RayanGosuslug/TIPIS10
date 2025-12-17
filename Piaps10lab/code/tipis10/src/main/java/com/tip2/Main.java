package com.tip2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== ДЕМОНСТРАЦИЯ СИСТЕМЫ УПРАВЛЕНИЯ КУРСАМИ (LMS) ===");

        // --- 1. Создание объектов ---

        // Создание Департамента (Department)
        Department csDept = new Department("Компьютерные науки");
        System.out.println("\nСоздан Департамент: " + csDept.getName());

        // Создание Курса (Course)
        Course course1 = new Course(101, "Программирование на Java", csDept);

        // Добавление курса в Департамент (вызывает Department.addCourse)
        csDept.addCourse(course1);

        // Создание Преподавателя (Instructor)
        Instructor profSmith = new Instructor(501, "Профессор Смит", "smith@tip2.com");

        // Назначение преподавателя на курс (вызывает Course.assignInstructor)
        course1.assignInstructor(profSmith);

        // Создание Студента (Student)
        Student studentMax = new Student(2024001, "Максим", "max@stud.com");

        // Создание Задания (Assignment)
        Date dueDate = new GregorianCalendar(2025, 0, 15).getTime(); // 15 января 2025
        Assignment hw1 = new Assignment("Домашняя работа 1: ООП", dueDate, csDept);

        // Добавление задания к курсу (вызывает Course.addAssignment, который добавляет его в Department)
        course1.addAssignment(hw1);

        // --- 2. Демонстрация Взаимодействия ---

        System.out.println("\n--- ВЗАИМОДЕЙСТВИЕ СИСТЕМЫ ---");

        // Студент зачисляется на курс (вызывает Student.enroll)
        studentMax.enroll(course1);

        // Студент сдает задание (вызывает Student.submitAssignment)
        studentMax.submitAssignment(hw1);

        // Преподаватель проверяет задание (вызывает Instructor.gradeAssignment)
        profSmith.gradeAssignment(hw1);

        // Задание оценивается (вызывает Assignment.evaluate)
        hw1.evaluate();

        // Проверка контактной информации (вызывает Person.getContactInfo через Instructor)
        System.out.println("Контактная информация преподавателя: " + profSmith.getContactInfo());

        // Уведомление студента (вызывает Student.notify)
        studentMax.notify("Ваше задание '" + hw1.getTitle() + "' проверено, оценка 5/5.");

        System.out.println("\n=== Демонстрация полной LMS-модели завершена. ===");
    }
}