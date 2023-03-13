package com.improve10x.recyclerviewapplications;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class InstagramRvViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageIv;
    public TextView contactNameTxt;
    public TextView descriptionTxt;

    public InstagramRvViewHolder(@NonNull View itemView) {
        super(itemView);
        imageIv = itemView.findViewById(R.id.image_iv);
        contactNameTxt = itemView.findViewById(R.id.contactname_txt);
        descriptionTxt = itemView.findViewById(R.id.description_txt);
    }
}
