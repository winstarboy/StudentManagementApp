package com.teamproject.student;

import com.teamproject.student.models.Student;
import com.teamproject.student.services.StudentService;
import com.teamproject.student.utils.InputHelper;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        boolean running = true;

        while (running) {
            System.out.println("\n=== Student Management ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            int choice = InputHelper.readInt("Choose option: ");

            switch (choice) {
                case 1:
                    int id = InputHelper.readInt("Enter the Student Id: ");
                    String name = InputHelper.readString("Enter Student name: ");
                    String grade = InputHelper.readString("Enter Student grade: ");
                    Student newStudent = new Student(id, name, grade);
                    service.addStudent(newStudent);
                    break;
                case 2:
                    service.viewStudents();
                    break;
                case 3:
                    int student_id = InputHelper.readInt("Enter the Student ID: ");
                    service.searchStudent(student_id);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
