package com.example.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.Adapter.OfferAdapter;
import com.example.app.Adapter.PackageAdapter;
import com.example.app.Class.Offer;
import com.example.app.Class.Package1;
import com.example.app.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GiftsFragment extends Fragment {
    ViewFlipper v_flipper;
    View rootView;
    @BindView(R.id.v_flipper)
    ViewFlipper flipper;
    List<Package1> lstBook1;
    List<Offer> offer;
    @BindView(R.id.ourpackage)
    RecyclerView recyclerview;
    @BindView(R.id.ouroffer)
    RecyclerView recyclerview1;
    public static GiftsFragment newInstance()
    {
        GiftsFragment GiftsFragment=new GiftsFragment();
        return GiftsFragment;
    }
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_gift, container, false);
        init();
        return rootView;

    }

    private void init() {
        try {
            ButterKnife.bind(this,rootView);
            lstBook1=new ArrayList<>();
            lstBook1.add(new Package1("Rose Garden Hotel","Surat","$30000",R.drawable.package1));
            lstBook1.add(new Package1("Avadh Garden Hotel","bardoli","$20000",R.drawable.package4));
            lstBook1.add(new Package1("Rajhansh Garden Hotel","Surat","$10000",R.drawable.package4));
            lstBook1.add(new Package1("Milano Garden Hotel","Bardoli","$5000",R.drawable.package2));
            lstBook1.add(new Package1("Rajhansh Garden Hotel","Surat","$10000",R.drawable.package3));
            lstBook1.add(new Package1("Milano Garden Hotel","Bardoli","$5000",R.drawable.package4));

            PackageAdapter myAdapter=new PackageAdapter(getActivity(),lstBook1);
            recyclerview.setAdapter(myAdapter);

            offer=new ArrayList<>();
            offer.add(new Offer("Up To 30%","Taylor Swift","$100",R.drawable.offer3));
            offer.add(new Offer("Up To 40%","Book1 Hall","$150",R.drawable.offer4));
            offer.add(new Offer("Up To 50%","Ribbon Tie","$300",R.drawable.offer2));
            offer.add(new Offer("Up To 60%","Hall","$200",R.drawable.offer1));

            OfferAdapter my=new OfferAdapter(getActivity(),offer);
            recyclerview1.setAdapter(my);


            int images[]={R.drawable.slider1,R.drawable.slider2,R.drawable.slider3};
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
        return "GiftsFragment";
    }
}
