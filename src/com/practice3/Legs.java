package com.practice3;

public class Legs extends Body {
    float maxSpeed;

    Legs(float hp, float maxSpeed){
        super(hp);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public float damage(float dam) {
        float hpAtStart = this.getHp();
        float hpAtEnd = super.damage(dam);
        maxSpeed *= (hpAtEnd / hpAtStart);
        return hpAtEnd;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
