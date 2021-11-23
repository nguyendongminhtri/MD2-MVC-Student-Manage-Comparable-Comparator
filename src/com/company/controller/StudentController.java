package com.company.controller;

import com.company.model.Student;
import com.company.service.IStudentService;
import com.company.service.StudentServiceImpl;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.List;

public class StudentController {
    IStudentService studentService = new StudentServiceImpl();
    public List<Student> showListStudent(){
       return studentService.findAll();
    }
    public void createStudent(Student student){
        studentService.save(student);
    }
    public void deleteStudent(int id){
        studentService.deleteById(id);
    }
    public Student detailStudent(int id){
       return studentService.findById(id);
    }
    public void editStudent(int id, Student student){
        Student student1 = studentService.findById(id);
        student1.setName(student.getName());
        student1.setAge(student.getAge());
        studentService.deleteById(id);
        studentService.save(student1);
    }
    public List<Student> sortStudentByAge(List<Student> sortByAge){
        studentService.sortByAge(sortByAge);
        return sortByAge;
    }
    public List<Student> sortStudentByName(List<Student> sortByName){
        studentService.sortByName(sortByName);
        return sortByName;
    }
}
