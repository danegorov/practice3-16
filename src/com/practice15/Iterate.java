package com.practice15;

public interface Iterate<T> extends Iterable<T> {
    boolean add(T el);
    boolean delete(int i);
    T get(int index);
    int getSize();
    void replace(int index, T el);

}
