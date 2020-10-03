package com.practice3;

public class HumanBuilder<T> {
    Human person;
    HumanBuilder(){
        person = new Human();
    }
    public HumanBuilder addHead(float hp, String info){
        person.setHead(new Head(hp, info));
        return this;
    }
    public HumanBuilder addBody(float hp){
        person.setBody(new Body(hp));
        return this;
    }
    public HumanBuilder addHand(float hp, String RightOrLeftHand, T object){
        person.setHand(new Hand<>(hp, object), RightOrLeftHand);
        return this;
    }
    public HumanBuilder addLegs(float h, float maxSpeed){
        person.setLegs(new Legs(h, maxSpeed));
        return this;
    }
    public HumanBuilder addName(String name){
        person.setName(name);
        return this;
    }
    public Human getPerson() {
        return person;
    }
}
