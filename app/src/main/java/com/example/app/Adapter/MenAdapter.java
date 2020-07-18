package com.example.app.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.BookDescAct;
import com.example.app.Class.Men;
import com.example.app.R;

import java.util.List;

public class MenAdapter extends RecyclerView.Adapter<MenAdapter.MyViewHolder> {
    private Context mContext;
    private List<Men> mData;

    public MenAdapter(Context mContext, List<Men> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater=LayoutInflater.from(mContext);
        view=mInflater.inflate(R.layout.men_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.bookimg.setImageResource(mData.get(position).getThumbnail());
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mContext, BookDescAct.class);
                i.putExtra("Thumbnail",mData.get(position).getThumbnail());
                mContext.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView bookimg;
        CardView cardview;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            bookimg=(ImageView) itemView.findViewById(R.id.bookimg);
            cardview =(CardView) itemView.findViewById(R.id.cardview_id);
        }
    }
}
