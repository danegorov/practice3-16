package com.practice15;


import java.util.Iterator;


public class Base<T> implements Iterate<T> {
    T[] array;
    Base() {
        array = (T[]) new Object[0];

    }
    Base(int size) {
        array = (T[]) new Object[size];
    }

    @Override
    public boolean add(T el) {
        try {
            T[] buff = array;
            array = (T[]) new Object[array.length + 1];
            System.arraycopy(buff, 0, array, 0, buff.length);
            array[array.length - 1] = el;
            return true;

        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int i) {
        try {
            T[] buff = array;
            array = (T[]) new Object[array.length - 1];
            System.arraycopy(buff, 0, array, 0, i);
            int lastCount = array.length - i;
            System.arraycopy(buff, i + 1, array, i, lastCount);
            return true;

        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public T get(int index) {

        return array[index];
    }

    @Override
    public int getSize() {
        return array.length;
    }

    @Override
    public void replace(int index, T el) {
        array[index] = el;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(array);
    }
}
