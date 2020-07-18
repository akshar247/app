package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class BookDescAct extends AppCompatActivity {
    private ImageView img;
    private TextView tvtitle,tvdescription,tvcate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_desc);
        tvtitle=(TextView) findViewById(R.id.txttitle);
        tvdescription=(TextView) findViewById(R.id.txtdesc);
        tvcate=(TextView) findViewById(R.id.txtcategory);
        img=(ImageView) findViewById(R.id.bookthumb);

        Intent i=getIntent();
        String Title=i.getExtras().getString("Title");
        String Description=i.getExtras().getString("Description");
        int image=i.getExtras().getInt("Thumbnail");
        tvtitle.setText(Title);
        tvdescription.setText(Description);
        img.setImageResource(image);
    }
}