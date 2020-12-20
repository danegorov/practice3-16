package com.practice13;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Students students = new Students();

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
        students = SortingStudentsByGPA.quickSort(students, 0, students.getSize() - 1);
        System.out.println(students); */


        ArrayList <Student> students1 = new ArrayList<>();
        students1.add(new Student(213));
        students1.add(new Student(121));
        students1.add(new Student(22));
        students1.add(new Student(11));

        ArrayList <Student> students2 = new ArrayList<>();
        students2.add(new Student(2113));
        students2.add(new Student(667));
        students2.add(new Student(66));
        students2.add(new Student(22));

        Students stud = new Students(students1);
        Students stud1 = new Students(students2);
        stud.glue(stud1);
        System.out.println(SortingStudentsByGPA.mergeSorting(stud, 0, stud1.getSize() - 1, stud.getSize() - 1).getArr());

    }
}
