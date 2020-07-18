package com.example.app.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.BookDescAct;
import com.example.app.Class.Service;
import com.example.app.R;

import java.util.List;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.MyViewHolder> {
    private Context mContext;
    private List<Service> mData;

    public ServiceAdapter(Context mContext, List<Service> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater=LayoutInflater.from(mContext);
        view=mInflater.inflate(R.layout.service_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.title.setText(mData.get(position).getTitle());
        holder.item1.setText(mData.get(position).getItem1());
        holder.item2.setText(mData.get(position).getItem2());
        holder.item3.setText(mData.get(position).getItem3());
        holder.bookimg.setImageResource(mData.get(position).getThumbnail());
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mContext, BookDescAct.class);
                i.putExtra("Title",mData.get(position).getTitle());
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

        TextView title,item1,item2,item3;
        ImageView bookimg;
        CardView cardview;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title=(TextView) itemView.findViewById(R.id.title);
            item1=(TextView) itemView.findViewById(R.id.item1);
            item2=(TextView) itemView.findViewById(R.id.item2);
            item3=(TextView) itemView.findViewById(R.id.item3);
            bookimg=(ImageView) itemView.findViewById(R.id.bookimg);
            cardview=(CardView) itemView.findViewById(R.id.cardview_id);
        }
    }
}
