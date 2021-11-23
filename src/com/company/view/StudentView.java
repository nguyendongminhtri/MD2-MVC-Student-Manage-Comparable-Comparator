package com.company.view;

import com.company.controller.StudentController;
import com.company.model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    StudentController studentController = new StudentController();
    Scanner scanner = new Scanner(System.in);
    List<Student> studentList = studentController.showListStudent();
    public void formShowListStudent(){
//        List<Student> student = studentController.showListStudent();
        System.out.println("List Student ===> "+studentList);
        System.out.println("Enter QUIT to back MENU: ");
        String quit = scanner.next();
        if(quit.equalsIgnoreCase("quit")){
            new Main();
        }
    }
    public void formCreateStudent(){
//        List<Student> studentList = studentController.showListStudent();
        boolean checkCreate = true;
        while (checkCreate){
            int id = studentList.size()+1;
            System.out.println("Enter name student: ");
            String name = scanner.next();
            System.out.println("Enter age student: ");
            int age = scanner.nextInt();
            Student student = new Student(id,name,age);
            studentController.createStudent(student);
            System.out.println("Create success! Enter any key to continue create - Enter quit to back MENU");
            String quit = scanner.next();
            if(quit.equalsIgnoreCase("quit")){
                new Main();
            }
        }

    }
    public void formDeleteStudent(){
        System.out.println("Enter id to delete Student: ");
        int id = scanner.nextInt();
        studentController.deleteStudent(id);
        System.out.println("Delete success! Enter any key to continue delete - Enter quit to back MENU");
        String quit = scanner.next();
        if(quit.equalsIgnoreCase("quit")){
            new Main();
        }
    }
    public void formDetailStudent(){
        System.out.println("Enter id to detail a student: ");
        int id = scanner.nextInt();
        System.out.println(studentController.detailStudent(id));
        System.out.println("Enter any key to continue detail - Enter quit to back MENU");
        String quit = scanner.next();
        if(quit.equalsIgnoreCase("quit")){
            new Main();
        }
    }
    public void formEditStudent(){

        System.out.println("Enter id to edit student: ");
        int id = scanner.nextInt();
        Student student = studentController.detailStudent(id);
        System.out.println("OLD STUDENT --> "+student);
        System.out.println("Enter 1 - Change name; Enter 2- Change Age; Enter 3 - Change All");
        int chooseEdit = scanner.nextInt();
        switch (chooseEdit){
            case 1:
                System.out.println("Enter change name");
                String name = scanner.next();
                student.setName(name);
                studentController.editStudent(id,student);
                System.out.println("Edit success!");
        }
        System.out.println("Enter any key to continue edit - Enter quit to back MENU");
        String quit = scanner.next();
        if(quit.equalsIgnoreCase("quit")){
            new Main();
        }
    }
    public void formSortByAge(){
        System.out.println(studentController.sortStudentByAge(studentList));
    }
    public void formSortByName(){
        System.out.println(studentController.sortStudentByName(studentList));
    }
}
