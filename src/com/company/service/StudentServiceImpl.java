package com.company.service;

import com.company.model.ComparatorStudent;
import com.company.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentServiceImpl implements IStudentService{
    public static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1, "a",5));
        studentList.add(new Student(2, "c",4));
        studentList.add(new Student(3, "d",6));
        studentList.add(new Student(4, "b",3));
    }
    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public void deleteById(int id) {
        for(int i=0; i< studentList.size();i++){
            if(id==studentList.get(i).getId()){
                studentList.remove(i);
            }
        }
    }

    @Override
    public Student findById(int id) {
        for(int i=0; i< studentList.size();i++){
            if(id==studentList.get(i).getId()){
               return studentList.get(i);
            }
        }
        return null;
    }

    @Override
    public void sortByAge(List<Student> sortByAge) {
        Collections.sort(sortByAge);
    }

    @Override
    public void sortByName(List<Student> sortByName) {
        ComparatorStudent comparatorStudent = new ComparatorStudent();
        Collections.sort(sortByName,comparatorStudent);
    }

}
