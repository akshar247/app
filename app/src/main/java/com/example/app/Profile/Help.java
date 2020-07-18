package com.example.app.Profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.app.R;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Help extends AppCompatActivity {
    private LinearLayout phone,email,instagram,fb,yt,twi,linked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);


        phone=(LinearLayout) findViewById(R.id.phone);
        email=(LinearLayout) findViewById(R.id.email);
        instagram=(LinearLayout) findViewById(R.id.insta);
        fb=(LinearLayout) findViewById(R.id.facebook);
        yt=(LinearLayout) findViewById(R.id.youtube);
        twi =(LinearLayout) findViewById(R.id.twitter);
        linked=(LinearLayout) findViewById(R.id.linked);

        instagram.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.instagram.com/_insta_poetry_aksharr_24_7_/"));
                startActivity(viewIntent);
            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://m.facebook.com/aksharr.dholakiyaa"));
                startActivity(viewIntent);
            }
        });
        yt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.youtube.com/channel/UCzqHWBj0nUQrNJEfdcZFkkA"));
                startActivity(viewIntent);
            }
        });
        twi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://twitter.com/akshar247"));
                startActivity(viewIntent);
            }
        });
        linked.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.linkedin.com/in/akshar247/"));
                startActivity(viewIntent);
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("mailto:aksharrdholakiyaa@gmail.com"));
                startActivity(viewIntent);
            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent = new Intent(Intent.ACTION_CALL);
                viewIntent.setData(Uri.parse("tel:9054298628"));

                if (ActivityCompat.checkSelfPermission(Help.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(viewIntent);
            }
        });
    }
}