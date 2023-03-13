package com.improve10x.recyclerviewapplications;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CallLogRvViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageUrlIv;
    public TextView numberTxt;
    public TextView timeAndCountryTxt;


    public CallLogRvViewHolder(@NonNull View itemView) {
        super(itemView);
        imageUrlIv = itemView.findViewById(R.id.image_iv);
        numberTxt = itemView.findViewById(R.id.contact_txt);
        timeAndCountryTxt = itemView.findViewById(R.id.country_txt);

    }
}
