package com.teamproject.student.services;

import com.teamproject.student.models.Student;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student.getName());
    }

    public void viewStudents() {
        if(students.isEmpty()) {
            System.out.println("No Students Found");
        } else {
            System.out.println("\n Student List: ");
            for (Student s: students) {
                System.out.println("Id: " + s.getId() + ", Name: " + s.getName() + ", Grade: " + s.getGrade());
            }
        }
    }

    public void searchStudent(int id) {
        for (Student s : students) {
            if(s.getId() == id) {
                System.out.println("\n Student Found: ");
                System.out.println("ID: " + s.getId());
                System.out.println("Name: " + s.getName());
                System.out.println("Grade: " + s.getGrade());
                return;
            }
        }
        System.out.println("Student with ID " + id + "not found.");
    }
}
