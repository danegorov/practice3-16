package com.practice15;

public class Int {
    int a;
    Int(int a) {
        this.a = a;
    }

    public int getInt() {
        return a;
    }

    public void setInt(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return Integer.toString(a);
    }
}
