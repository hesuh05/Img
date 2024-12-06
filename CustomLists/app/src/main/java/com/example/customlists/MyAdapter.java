package com.example.customlists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    List<Element> elements;
    public MyAdapter(Context context, List<Element> elements){
        this.context = context;
        this.elements = elements;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.element_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvName.setText(elements.get(position).getName());
        holder.tvArtist.setText(elements.get(position).getName());
        holder.ivImg.setImageResource(elements.get(position).getI());
    }

    @Override
    public int getItemCount() {
        return elements.size();
    }
}
