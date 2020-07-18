package com.example.app.Class;

public class Men1 {
    private String Title;
    private int Thumbnail;
    public Men1() {
    }

    public Men1(String title, int thumbnail) {
        Title = title;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }


    public int getThumbnail() {
        return Thumbnail;
    }


    public void setTitle(String title) {
        Title = title;
    }


    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
