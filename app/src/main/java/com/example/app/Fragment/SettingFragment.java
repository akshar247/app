package com.example.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.Adapter.BodyAdapter;
import com.example.app.Adapter.DressAdapter;
import com.example.app.Adapter.HairAdapter;
import com.example.app.Adapter.Ladies1Adapter;
import com.example.app.Adapter.LadiesAdapter;
import com.example.app.Adapter.Men1Adapter;
import com.example.app.Adapter.MenAdapter;
import com.example.app.Class.Body;
import com.example.app.Class.Ladies1;
import com.example.app.Class.Ladies;
import com.example.app.Class.Dress;
import com.example.app.Class.Hair;
import com.example.app.Class.Ladies;
import com.example.app.Class.Ladies1;
import com.example.app.Class.Men;
import com.example.app.Class.Men1;
import com.example.app.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SettingFragment extends androidx.fragment.app.Fragment {
    View rootView;

    public static GiftsFragment newInstance()
    {
        GiftsFragment GiftsFragment=new GiftsFragment();
        return GiftsFragment;
    }
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_setting, container, false);
        init();
        return rootView;

    }

    private void init() {
        try {
            ButterKnife.bind(this,rootView);

        }


        catch (Exception e)
        {

        }


    }


    @Override
    public String toString() {
        return "ServiceFragment";
    }
}
