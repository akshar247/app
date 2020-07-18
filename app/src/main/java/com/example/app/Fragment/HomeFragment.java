package com.example.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.Adapter.Home1Adapter;
import com.example.app.Adapter.HomeAdapter;
import com.example.app.Class.Home;
import com.example.app.Class.Home1;
import com.example.app.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment {
    ViewFlipper v_flipper;
    View rootView;
    @BindView(R.id.v_flipper)
    ViewFlipper flipper;
    List<Home> stBook;
    List<Home1> lstBook;
    @BindView(R.id.recyclerview1)
    RecyclerView recyclerview1;
    @BindView(R.id.recyclerview2)
    RecyclerView recyclerview2;
    private Object HomeFragment;

    public static HomeFragment newInstance()
    {
        HomeFragment HomeFragment=new HomeFragment();
        return HomeFragment;
    }
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_home, container, false);
        init();
        return rootView;

    }

    private void init() {
        try {
            ButterKnife.bind(this,rootView);
            stBook=new ArrayList<>();
            stBook.add(new Home("Booking Services","Category","Category",R.drawable.other));
            stBook.add(new Home("Book a Hotel","Category","Description Book",R.drawable.hotel));
            stBook.add(new Home("Salon Services","Category","Category",R.drawable.salon));
            stBook.add(new Home("Ladies Services","Category","Description Book",R.drawable.ladies));
            stBook.add(new Home("Dresses","Category","Description Book",R.drawable.dresses));
            stBook.add(new Home("View All","Category","Category",R.drawable.all));
            HomeAdapter myAdapter=new HomeAdapter(getActivity(),stBook);
            GridLayoutManager gridLayoutManager1 = new GridLayoutManager((Context) HomeFragment, 3);
            recyclerview1.setLayoutManager(gridLayoutManager1);
            recyclerview1.setAdapter(myAdapter);

            lstBook=new ArrayList<>();
            lstBook.add(new Home1("Rove Dubai Marina","$35000","4386 Hershall Hollow Road eer Lodge",R.drawable.home1,3));
            lstBook.add(new Home1("Ai Bandar Rotana","$35000","4386 Hershall Hollow Road eer Lodge",R.drawable.home2,4));
            lstBook.add(new Home1("Dubai Motel","#36000","4386 Hershall Hollow Road eer Lodge",R.drawable.home3,3));
            lstBook.add(new Home1("Rove Dubai Marina","$35000","4386 Hershall Hollow Road eer Lodge",R.drawable.home1,3));
            lstBook.add(new Home1("Ai Bandar Rotana","$35000","4386 Hershall Hollow Road eer Lodge",R.drawable.home2,4));
            lstBook.add(new Home1("Dubai Motel","#36000","4386 Hershall Hollow Road eer Lodge",R.drawable.home3,3));
            lstBook.add(new Home1("Dubai Motel","#36000","4386 Hershall Hollow Road eer Lodge",R.drawable.home3,3));
            Home1Adapter myAdapter1=new Home1Adapter(getActivity(),lstBook);
            recyclerview2.setLayoutManager(new GridLayoutManager(getActivity(),1));
            recyclerview2.setAdapter(myAdapter1);



            int images[]={R.drawable.slide1,R.drawable.slide2,R.drawable.slide3};


            for (int image:images)
            {
                flipperImages(image);
            }


        }


        catch (Exception e)
        {

        }


    }

    public void flipperImages(int image) {
            ImageView imageView= new ImageView(getActivity());
            imageView.setImageResource(image);
            flipper.addView(imageView);
            flipper.setFlipInterval(3000);
            flipper.setAutoStart(true);

            flipper.setInAnimation(getActivity(),android.R.anim.slide_in_left);
            flipper.setOutAnimation(getActivity(),android.R.anim.slide_out_right);



    }


    @Override
    public String toString() {
        return "HomeFragment";
    }
}
