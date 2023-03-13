package com.improve10x.recyclerviewapplications;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MessengerRvViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageUrlIv;
    public TextView messengerNameTxt;
    public TextView descriptionTxt;
    public MessengerRvViewHolder(@NonNull View itemView) {
        super(itemView);
        imageUrlIv = itemView.findViewById(R.id.image_iv);
        messengerNameTxt = itemView.findViewById(R.id.name_txt);
        descriptionTxt = itemView.findViewById(R.id.description_txt);
    }
}
