package com.practice11.punkt2;

import java.awt.*;

public class StringConverter {
    String color;


    StringConverter(String color) {
        this.color = color;

    }

    public Color getColor() {
        switch (color.toLowerCase()){
            case "red":
                return new Color(255, 0, 0);
            case "blue":
                return new Color(0, 0, 255);
            case "black":
                return new Color(0, 0, 0);

        }
        return null;
    }

}
