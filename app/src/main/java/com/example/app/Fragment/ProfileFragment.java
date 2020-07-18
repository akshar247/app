package com.example.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.Adapter.CartAdapter;
import com.example.app.Class.Cart;
import com.example.app.Login;
import com.example.app.Profile.AccountInfo;
import com.example.app.Profile.ChangePassword;
import com.example.app.Profile.Help;
import com.example.app.Profile.MyCart;
import com.example.app.Profile.MyOrder;
import com.example.app.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfileFragment extends androidx.fragment.app.Fragment {
    View rootView;
    private static final int GALLERY_INTENT_CODE = 1023 ;
    LinearLayout order,cart,account,password,help,logout;
    @BindView(R.id.profileName)
    TextView fullName;


    public static CartFragment newInstance() {
        CartFragment CartFragment = new CartFragment();
        return CartFragment;
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        order = (LinearLayout) rootView.findViewById(R.id.order);


        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MyOrder.class);
                startActivity(i);
            }
        });

        cart = (LinearLayout) rootView.findViewById(R.id.cart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MyCart.class);
                startActivity(i);
            }
        });

        account = (LinearLayout) rootView.findViewById(R.id.account);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AccountInfo.class);
                startActivity(i);
            }
        });

        password = (LinearLayout) rootView.findViewById(R.id.password);
        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ChangePassword.class);
                startActivity(i);
            }
        });

        help = (LinearLayout) rootView.findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Help.class);
                startActivity(i);
            }
        });


        logout = (LinearLayout) rootView.findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getActivity(),Login.class));
                getActivity().finish();
            }
        });


        return rootView;
}

    @Override
    public String toString() {
        return "CartFragment";
    }


}