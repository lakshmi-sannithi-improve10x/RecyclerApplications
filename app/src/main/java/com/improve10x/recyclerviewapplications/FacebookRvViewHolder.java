package com.improve10x.recyclerviewapplications;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FacebookRvViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageUrlIv;
    public TextView contactNameTxt;
    public TextView timeTxt;
    public FacebookRvViewHolder(@NonNull View itemView) {
        super(itemView);
        imageUrlIv = itemView.findViewById(R.id.image_iv);
        contactNameTxt = itemView.findViewById(R.id.contactname_txt);
        timeTxt = itemView.findViewById(R.id.time_txt);
    }
}
