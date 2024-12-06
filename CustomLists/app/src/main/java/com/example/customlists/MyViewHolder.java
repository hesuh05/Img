package com.example.customlists;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView ivImg;
    TextView tvName,tvArtist;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        ivImg = itemView.findViewById(R.id.iv_img);
        tvName = itemView.findViewById(R.id.tv_name);
        tvArtist = itemView.findViewById(R.id.tv_artist);
    }
}
