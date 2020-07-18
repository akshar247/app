package com.example.app.Class;

public class Service {
    private String Title;
    private String Item1;
    private int Thumbnail;
    private String Item2;
    private String Item3;

    public Service() {
    }

    public Service(String title, String item1, String item2, String item3, int thumbnail) {
        Title = title;
        Item1 = item1;
        Item2 = item2;
        Item3 = item3;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getItem1() {
        return Item1;
    }

    public void setItem1(String item1) {
        Item1 = item1;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public String getItem2() {
        return Item2;
    }

    public void setItem2(String item2) {
        Item2 = item2;
    }

    public String getItem3() {
        return Item3;
    }

    public void setItem3(String item3) {
        Item3 = item3;
    }
}