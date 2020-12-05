package com.practice13;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Students students = new Students();

        Student one = new Student(1232);
        Student two = new Student(2);
        Student three = new Student(11);
        Student four = new Student(23);
        Student five = new Student(4);
        Student six = new Student(412);

        students.add(five);
        students.add(three);
        students.add(four);
        students.add(one);
        students.add(two);
        students.add(six);

        students = SortingStudentsByGPA.mergeSorting(students, 0, 2, 5);
        System.out.println(students);
    }
}
