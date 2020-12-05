package com.practice13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerArray;

public abstract class SortingStudentsByGPA implements Comporator {

    public static Student[] sort(Student[] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (arr[i].getGPA() < arr[j].getGPA()) {

                    Student buf = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buf;
                }
            }
        }
        return arr;
    }

    public static Students mergeSorting(Students students, int i1, int i2, int j2) {
        Student[] array = new Student[students.getSize()];

        for (int i = 0; i < students.getSize(); i++) {
            array[i] = students.get(i);
        }
        int n1 = i2 -  i1 + 1;

        int n2 = j2 - i2;

        Student[] arr1 = new Student[n1];
        System.out.println(arr1.length);
        Student[] arr2 = new Student[n2];


        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = array[i];
        }

        System.out.println(arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = array[i + arr1.length];
            System.out.println(array[i]);
        }

        arr1 = sort(arr1, arr1.length);

        arr2 = sort(arr2, arr2.length);

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (arr2[j].getGPA() >= arr1[i].getGPA()) {

                array[k] = arr2[j];
                j++;

            } else {

                array[k] = arr1[i];
                i++;

            }

            k++;

        }

        while (i < n1) {

            array[k] = arr1[i];
            k++;
            i++;

        }

        while (j < n2) {

            array[k] = arr2[j];
            k++;
            j++;

        }


        Students st = new Students(array);

        return st;
    }


}
