package com.improve10x.recyclerviewapplications;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class InstagramRvAdapter extends RecyclerView.Adapter<InstagramRvViewHolder> {
    public InstagramItems[] items;
    public InstagramRvAdapter(InstagramItems[] instagramItems){
        items = instagramItems;
    }
    @NonNull
    @Override
    public InstagramRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.instagram_items,parent,false);
        InstagramRvViewHolder viewHolder = new InstagramRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull InstagramRvViewHolder holder, int position) {
        InstagramItems item = items[position];
        holder.contactNameTxt.setText(item.contactName);
        holder.descriptionTxt.setText(item.description);
        Picasso.get().load(item.imageUrl).into(holder.imageIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
