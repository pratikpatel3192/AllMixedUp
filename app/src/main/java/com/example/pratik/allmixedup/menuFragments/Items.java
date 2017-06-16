package com.example.pratik.allmixedup.menuFragments;

/**
 * Created by prati on 06-06-2017.
 */

public class Items {
    private int image;
    private String name;

    public Items(String name,int image) {
        this.image = image;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
