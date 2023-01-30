package main.java;

import main.java.ComputerScienceStudent;
import main.java.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Hans", 1);
        Student student2 = new Student("Tony", 2);
        Student student3 = new Student("Lena", 3);
        Student student4 = new Student("Tom", 4);

        ComputerScienceStudent student5 = new ComputerScienceStudent("Johannes",5, new String[] {"Java", "JavaScript"});
        System.out.println(student5);



    }
}
