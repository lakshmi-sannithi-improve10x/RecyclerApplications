package com.improve10x.recyclerviewapplications;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TwitterRvViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageUrlIv;
    public TextView nameTxt;
    public TextView timeTxt;
    public TextView descriptionTxt;
    public TextView messegeNoTxt;
    public TextView rotateNoTxt;
    public TextView favoriteNoTxt;
    public TextView joneTxt;
    public TwitterRvViewHolder(@NonNull View itemView) {
        super(itemView);
         imageUrlIv = itemView.findViewById(R.id.image_iv);
         nameTxt = itemView.findViewById(R.id.name_txt);
         timeTxt = itemView.findViewById(R.id.time_txt);
         descriptionTxt = itemView.findViewById(R.id.description_txt);
         messegeNoTxt = itemView.findViewById(R.id.meessegeno_txt);
         rotateNoTxt = itemView.findViewById(R.id.rotateno_txt);
         favoriteNoTxt = itemView.findViewById(R.id.favouriteno_txt);
         joneTxt = itemView.findViewById(R.id.jone_txt);
    }
}
