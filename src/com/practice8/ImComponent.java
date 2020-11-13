package com.practice8;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ImComponent extends JComponent {
    ArrayList<Image> pictures;
    public ImComponent(){
        super();
        pictures = new ArrayList<>();
    }
    public void addImage(Image image) {
        pictures.add(image);

    }

    public void setPictures(ArrayList<Image> pictures) {
        this.pictures = pictures;
    }

    public ArrayList<Image> getPictures() {
        return pictures;
    }

    public Image getPicture(int index) {
        return pictures.get(index);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for ( Image pic : pictures){
            System.out.print(getWidth());

            g.drawImage(pic, 0, 0, null);
        }
    }
}

