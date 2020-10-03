package com.practice3;

public class Body {
    float hp;
    Body(float hp){
        this.hp = hp;
    }
    public float damage(float dam){
        hp -= dam;
        return hp;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }
}
