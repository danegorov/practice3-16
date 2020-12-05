package com.practice13;

import com.practice3.Human;

public class Student extends Human {
    static int count = 1;
    int idNumber;
    float GPA;
    Student() {

        super();
        idNumber = count;
        count++;
        GPA = 0;

    }
    Student(float GPA) {

        this.GPA = GPA;
        idNumber = count;
        count++;

    }

    public int getIdNumber() {

        return idNumber;

    }

    public static int getCount() {

        return count;

    }

    public float getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "ID=  " + Float.toString(idNumber) + " GPA= " + Float.toString(GPA) + "\n";
    }
}
