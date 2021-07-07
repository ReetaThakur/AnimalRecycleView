package com.example.animalrecycleview;

import android.widget.ImageView;
import android.widget.TextView;

public class Animal {
    private int image;
    private String type;
    private String sound;

    public Animal(int image, String type, String sound) {
        this.image = image;
        this.type = type;
        this.sound = sound;
    }

    public int getImage() {
        return image;
    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }
}
