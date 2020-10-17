package com.practice8;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayFactory {
    int countOb;
    int[] counts;
    public RandomArrayFactory(int countOb){
        this.countOb = countOb;

        Random ran = new Random();
        counts = new int[3];
        for (int i = 0; i < counts.length; i++) {
            if(countOb == 0) break;
            counts[i] = ran.nextInt(countOb) + 1;
            countOb -= counts[i];
        }
    }
    public ArrayList<Shape> makeArray(){
        ArrayList<Shape> arr= new ArrayList<>();
        for(int i = 0; i < counts[0]; i++){
            arr.add(new Circle(new Random()));
        }
        for(int i = 0; i < counts[1]; i++){
            arr.add(new Rectangle(new Random()));
        }
        for(int i = 0; i < counts[2]; i++){
            arr.add(new Square(new Random()));
        }
        return arr;
    }
}
