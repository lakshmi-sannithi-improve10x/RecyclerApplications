package com.improve10x.recyclerviewapplications;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class TwitterRvAdapter extends RecyclerView.Adapter<TwitterRvViewHolder> {
    public TwitterItems[] items;
    public TwitterRvAdapter(TwitterItems[] twitterItems){
        items = twitterItems;
    }
    @NonNull
    @Override
    public TwitterRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater  = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.twitter_items,parent,false);
        TwitterRvViewHolder viewHolder = new TwitterRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TwitterRvViewHolder holder, int position) {
          TwitterItems item = items[position];
          holder.nameTxt.setText(item.name);
          holder.timeTxt.setText(item.time);
          holder.descriptionTxt.setText(item.description);
          holder.messegeNoTxt.setText(item.messegeNo);
          holder.rotateNoTxt.setText(item.rotateNo);
          holder.favoriteNoTxt.setText(item.favoriteNo);
          holder.joneTxt.setText(item.jone);
       // Picasso.get().load(item.imageUrl).into(holder.imageUrlIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
