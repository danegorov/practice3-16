package com.practice3;

public class Hand<T> extends Body{
    T object;
    Hand(float hp){
        super(hp);
    }
    Hand(float hp, T object){
        super(hp);
        this.object = object;
    }
    public void takeObject(T object){
        this.object = object;
    }
    public void throwThis(){
        this.object = null;
    }

    public T getObject() {
        return object;
    }

}
