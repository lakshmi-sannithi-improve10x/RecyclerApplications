package com.improve10x.recyclerviewapplications;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class CallLogRvAdapter extends RecyclerView.Adapter<CallLogRvViewHolder> {
    public CallLogItems[] items;
    public CallLogRvAdapter(CallLogItems[] callLogItems){
        items = callLogItems;
    }
    @NonNull
    @Override
    public CallLogRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.calllog_items,parent,false);
        CallLogRvViewHolder viewHolder = new CallLogRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CallLogRvViewHolder holder, int position) {
        CallLogItems item = items[position];
        holder.numberTxt.setText(item.number);
        holder.timeAndCountryTxt.setText(item.timeAndCountry);
        Picasso.get().load(item.imageUrl).into(holder.imageUrlIv);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
