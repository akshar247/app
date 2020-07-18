package com.example.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.Adapter.CartAdapter;
import com.example.app.Class.Cart;
import com.example.app.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class CartFragment extends Fragment {
    List<Cart> lstBook=new ArrayList<>();
    View rootView;
    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;

    public static CartFragment newInstance()
    {
        CartFragment CartFragment=new CartFragment();
        return CartFragment;
    }
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        /*  View rootView =inflater.inflate(R.layout.fragment_cart,null);*/
        rootView = inflater.inflate(R.layout.fragment_cart, container, false);
        init();
        return rootView;

    }

    private void init() {
        try {
            ButterKnife.bind(this,rootView);
            lstBook.add(new Cart("Weddings","Category","Category",R.drawable.weddings));
            lstBook.add(new Cart("Birthdays","Category","Description Book",R.drawable.birthday));
            lstBook.add(new Cart("National Events","Category","Description Book",R.drawable.national));
            lstBook.add(new Cart("Graduation Parties","Category","Category",R.drawable.gratuation));
            lstBook.add(new Cart("Baby Showers","Category","Description Book",R.drawable.baby));
            lstBook.add(new Cart("Other Events","Category","Description Book",R.drawable.other));

            CartAdapter myAdapter=new CartAdapter(getActivity(),lstBook);
            recyclerview.setLayoutManager(new GridLayoutManager(getActivity(),2));
            recyclerview.setAdapter(myAdapter);
        }
        catch (Exception e)
        {
            Toast.makeText(getActivity(), "eroro--------->"+e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public String toString() {
        return "CartFragment";
    }
}