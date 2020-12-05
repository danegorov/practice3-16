package com.practice3;

public class Human {
    String name;
    public Head head;
    public Body body;
    public Hand hands[] = new Hand[2];
    public Legs legs;
    enum Hands {RightHand, LeftHand};

    public Human() {

    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setHand(Hand hand, String handN) {
        if(Hands.valueOf(handN) == Hands.LeftHand){
            this.hands[0] = hand;
        }else{
            this.hands[1] = hand;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLegs(Legs legs) {
        this.legs = legs;
    }
}
