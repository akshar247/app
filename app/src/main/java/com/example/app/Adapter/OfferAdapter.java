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
import com.example.app.Class.Offer;
import com.example.app.R;

import java.util.List;

public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.MyViewHolder> {

    private Context mContext;
    private List<Offer> mData;

    public OfferAdapter(Context mContext, List<Offer> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater=LayoutInflater.from(mContext);
        view=mInflater.inflate(R.layout.item_offers,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.title.setText(mData.get(position).getTitle());
        holder.category.setText(mData.get(position).getCategory());
        holder.description.setText(mData.get(position).getDescription());
        holder.bookimg.setImageResource(mData.get(position).getThumbnail());
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mContext,BookDescAct.class);
                i.putExtra("Title",mData.get(position).getTitle());
                i.putExtra("Description",mData.get(position).getDescription());
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

        TextView title;
        TextView category;
        TextView description;
        ImageView bookimg;
        CardView cardview;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title=(TextView) itemView.findViewById(R.id.title);
            category=(TextView) itemView.findViewById(R.id.category);
            description=(TextView) itemView.findViewById(R.id.description);
            bookimg=(ImageView) itemView.findViewById(R.id.bookimg);
            cardview=(CardView) itemView.findViewById(R.id.cardview_id);

        }
    }

}
