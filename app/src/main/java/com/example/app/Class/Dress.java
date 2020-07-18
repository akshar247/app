package com.example.app.Class;

public class Dress {
    private String Title;
    private String Category;
    private int Thumbnail;
    private  float Rating;
    public Dress() {
    }

    public Dress(String title, String category, int thumbnail, float rating) {
        Title = title;
        Category = category;
        Thumbnail = thumbnail;
        Rating = rating;
    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public float getRating() {
        return Rating;
    }

    public void setRating(float rating) {
        Rating = rating;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }


    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
