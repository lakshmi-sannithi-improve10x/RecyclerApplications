package com.improve10x.recyclerviewapplications;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GmailRvViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageUrlIv;
    public TextView nameTxt;
    public TextView descriptionTxt;
    public  TextView timeTxt;

    public GmailRvViewHolder(@NonNull View itemView) {
        super(itemView);
        imageUrlIv = itemView.findViewById(R.id.image_iv);
        nameTxt = itemView.findViewById(R.id.name_txt);
        descriptionTxt = itemView.findViewById(R.id.description_txt);
        timeTxt = itemView.findViewById(R.id.time_txt);
    }
}
