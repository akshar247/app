package com.example.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.Adapter.ServiceAdapter;
import com.example.app.Adapter.OfferAdapter;
import com.example.app.Class.Service;
import com.example.app.Class.Service;
import com.example.app.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SserviceFragment extends Fragment {
    List<Service> lstBook;
    @BindView(R.id.hair)
    RecyclerView hair;
    View rootView;
    public static GiftsFragment newInstance()
    {
        GiftsFragment GiftsFragment=new GiftsFragment();
        return GiftsFragment;
    }
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_service, container, false);
        init();
        return rootView;

    }

    private void init() {
        try {
            ButterKnife.bind(this,rootView);
            lstBook=new ArrayList<>();
            lstBook.add(new Service("Booking Services","● Book a hotel","● Book a hallv","● Book a camping",R.drawable.services1));
            lstBook.add(new Service("Catering Services","● Book a Catering in Event","● Booka catering in hall","",R.drawable.services2));
            lstBook.add(new Service("Salon Services","● Ladies Services","● Men Services","",R.drawable.services3));
            lstBook.add(new Service("Event Panning","● Conferences","● Seminars","● Company Meerings",R.drawable.services4));
            lstBook.add(new Service("Other Services","● Weddings","● Birthdays","● Gradution Parties",R.drawable.services5));
            ServiceAdapter myAdapter1=new ServiceAdapter(getActivity(),lstBook);
            hair.setAdapter(myAdapter1);

        }


        catch (Exception e)
        {

        }


    }


    @Override
    public String toString() {
        return "GiftsFragment";
    }
}
