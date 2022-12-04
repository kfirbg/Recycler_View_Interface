package com.example.task_2;

public class DataModel {
    String name;
    int id_;
    int image;
    String ShortData;

    public DataModel(String name, int id_, int image, String shortData) {
        this.name = name;
        this.id_ = id_;
        this.image=image;
        this.ShortData = shortData;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }

    public  String getShortData(){return ShortData;}


}
