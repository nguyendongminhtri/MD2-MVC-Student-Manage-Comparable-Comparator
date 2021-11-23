package com.company.service;

import com.company.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void save(Student student);
    void deleteById(int id);
    Student findById(int id);
    void sortByAge(List<Student> sortByAge);
    void sortByName(List<Student> sortByName);
}
