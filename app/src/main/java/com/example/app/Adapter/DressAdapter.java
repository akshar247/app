package com.example.app.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.BookDescAct;
import com.example.app.Class.Dress;
import com.example.app.R;

import java.util.List;

public class DressAdapter extends RecyclerView.Adapter<DressAdapter.MyViewHolder> {
    private Context mContext;
    private List<Dress> mData;

    public DressAdapter(Context mContext, List<Dress> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater=LayoutInflater.from(mContext);
        view=mInflater.inflate(R.layout.dresses_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.title.setText(mData.get(position).getTitle());
        holder.cat.setText(mData.get(position).getCategory());
        holder.bookimg.setImageResource(mData.get(position).getThumbnail());
        holder.rating.setRating(mData.get(position).getRating());
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mContext, BookDescAct.class);
                i.putExtra("Title",mData.get(position).getTitle());
                i.putExtra("Thumbnail",mData.get(position).getThumbnail());
                i.putExtra("Rating",mData.get(position).getRating());
                mContext.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView title,cat;
        RatingBar rating;
        ImageView bookimg;
        CardView cardview;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title=(TextView) itemView.findViewById(R.id.title);
            cat=(TextView) itemView.findViewById(R.id.category);
            bookimg=(ImageView) itemView.findViewById(R.id.bookimg);
            rating=(RatingBar) itemView.findViewById(R.id.ratingBar);
            cardview=(CardView) itemView.findViewById(R.id.cardview_id);
        }
    }
}
