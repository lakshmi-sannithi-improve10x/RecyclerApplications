package com.improve10x.recyclerviewapplications;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class FacebookRvAdapter extends RecyclerView.Adapter<FacebookRvViewHolder> {
    public FacebookItems[] items;
    public FacebookRvAdapter(FacebookItems[] facebookItems){
        items = facebookItems;
    }

    @NonNull
    @Override
    public FacebookRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.facebook_items,parent,false);
        FacebookRvViewHolder viewHolder = new FacebookRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FacebookRvViewHolder holder, int position) {
        FacebookItems item = items[position];
        holder.contactNameTxt.setText(item.contactName);
        holder.timeTxt.setText(item.time);
        Picasso.get().load(item.imageUrl).into(holder.imageUrlIv);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
