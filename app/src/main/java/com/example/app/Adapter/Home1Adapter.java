package com.example.app.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.BookDescAct;
import com.example.app.Class.Home1;
import com.example.app.R;

import java.util.List;

public class Home1Adapter extends RecyclerView.Adapter<Home1Adapter.MyViewHolder> {
    private Context mContext;
    private List<Home1> mData;

    public Home1Adapter(Context mContext, List<Home1> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater=LayoutInflater.from(mContext);
        view=mInflater.inflate(R.layout.item_main_home,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.title.setText(mData.get(position).getTitle());
        holder.cat.setText(mData.get(position).getCategory());
        holder.des.setText(mData.get(position).getDescription());
        holder.bookimg.setImageResource(mData.get(position).getThumbnail());
        holder.rating.setRating(mData.get(position).getRating());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mContext, BookDescAct.class);
                i.putExtra("Title",mData.get(position).getTitle());
                i.putExtra("Description",mData.get(position).getDescription());
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

        TextView title,cat,des;
        RatingBar rating;
        ImageView bookimg;
        Button button;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title=(TextView) itemView.findViewById(R.id.title);
            cat=(TextView) itemView.findViewById(R.id.category);
            des=(TextView) itemView.findViewById(R.id.description);
            bookimg=(ImageView) itemView.findViewById(R.id.bookimg);
            rating=(RatingBar) itemView.findViewById(R.id.ratingBar);
            button=(Button) itemView.findViewById(R.id.button1);
        }
    }
}
