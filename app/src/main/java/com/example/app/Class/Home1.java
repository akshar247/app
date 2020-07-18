package com.example.app.Class;

import android.widget.RatingBar;

public class Home1 {
    private String Title;
    private String Category;
    private String Description;
    private int Thumbnail;
    private  float Rating;
    public Home1() {
    }

    public Home1(String title, String category, String description, int thumbnail,float rating) {
        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
        Rating = rating;
    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
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

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
