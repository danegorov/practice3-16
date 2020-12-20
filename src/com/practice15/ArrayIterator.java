package com.practice15;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    T[] array;
    int currentIndex;
    public ArrayIterator(T[] array) {
        this.array = array;
        currentIndex = -1;

    }

    @Override
    public boolean hasNext() {
        return currentIndex + 1 < array.length;
    }


    @Override
    public T next() {
        return array[++currentIndex];
    }
}
