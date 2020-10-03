package com.practice3;

import java.util.ArrayList;

public class Head extends Body {
    ArrayList<String> inMind = new ArrayList<>();
    Head( float hp, String info){
        super(hp);
        inMind.add(info);
    }
    public void puishInfoBack(String info){
        inMind.add(info);
    }
    public void delIInfo(int index){
        inMind.remove(index);
    }
    public String getInfo(int index){
        return inMind.get(index);
    }
    public ArrayList<String> getAllMemory(){
        return inMind;
    }
}
