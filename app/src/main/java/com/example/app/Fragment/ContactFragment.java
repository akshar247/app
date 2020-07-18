package com.example.app.Fragment;
import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.Adapter.Home1Adapter;
import com.example.app.Adapter.HomeAdapter;
import com.example.app.Class.Home;
import com.example.app.Class.Home1;
import com.example.app.Profile.AccountInfo;
import com.example.app.Profile.ChangePassword;
import com.example.app.Profile.Help;
import com.example.app.Profile.MyCart;
import com.example.app.Profile.MyOrder;
import com.example.app.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ContactFragment extends Fragment {
    View rootView;
    @BindView(R.id.insta)
    LinearLayout instagram;
    @BindView(R.id.facebook)
    LinearLayout fb;
    @BindView(R.id.youtube)
    LinearLayout yt;
    @BindView(R.id.twitter)
    LinearLayout twi;
    @BindView(R.id.linked)
    LinearLayout linked;
    @BindView(R.id.email)
    LinearLayout email;
    @BindView(R.id.phone)
    LinearLayout phone;

    public static CartFragment newInstance() {
        CartFragment CartFragment = new CartFragment();
        return CartFragment;
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_contactus, container, false);
        init();
        return rootView;
    }
    private void init() {
        try {
            ButterKnife.bind(this, rootView);

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

                    if (ActivityCompat.checkSelfPermission(getActivity(),Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        return;
                    }
                    startActivity(viewIntent);
                }
            });


        } catch (Exception e) {

        }
    }

    @Override
    public String toString() {
        return "CartFragment";
    }
}
