package com.practice13;

import com.practice11.punkt2.StringConverter;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class Students {
    ArrayList<Student> array;
    int size;
    public Students() {
        array = new ArrayList<>();
        size = 0;
    }

    public Students(ArrayList<Student> array) {
        this.array = array;
        size = array.size();
    }

    Students(Student[] arr) {
        array = new ArrayList<>();
        for (Student el : arr) {
            array.add(el);
        }
    }

    public void add(Student student) {

        array.add(student);
        size++;

    }
    public Student get(int i) {
        return array.get(i);
    }

    public void setArray(ArrayList<Student> array) {

        this.array = array;
        size = array.size();

    }

    private void sortInAscendingOrder() {
        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {

                if (array.get(j).getIdNumber() < array.get(i).getIdNumber()) {
                    Student buf = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, buf);


                }
            }
        }
    }


    public void sort() {

        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {

                if (array.get(j).getIdNumber() < array.get(i).getIdNumber()) {
                    Student buf = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, buf);


                }
            }
        }

    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Students{" +
                "array=" + array.toString() +
                '}';
    }
}

