package com.improve10x.recyclerviewapplications;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class MessengerRvAdapter extends RecyclerView.Adapter<MessengerRvViewHolder> {
    public MessengerItems[] items;
    public MessengerRvAdapter(MessengerItems[] messengerItems){
        items = messengerItems;
    }
    @NonNull
    @Override
    public MessengerRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.messenger_items,parent,false);
        MessengerRvViewHolder viewHolder = new MessengerRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MessengerRvViewHolder holder, int position) {
        MessengerItems item = items[position];
        holder.messengerNameTxt.setText(item.messengerName);
        holder.descriptionTxt.setText(item.description);
        Picasso.get().load(item.imageUrl).into(holder.imageUrlIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
