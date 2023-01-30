package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDB {

    //private Student[] students; old version
    private List<Student> studentList = new ArrayList<>();

    public StudentDB(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentList=" + studentList +
                '}';
    }
//public Student[] getAllStudents() {
    //    return students;
    //}



}



