package com.example.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {

    private ArrayList<RecyclerViewItem> arrayList;

    public static class RecyclerViewViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView textView;
        public TextView textView2;

        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
        }
    }

    public RecyclerViewAdapter(ArrayList<RecyclerViewItem> arrayList){
        this.arrayList = arrayList;
    }
    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_item, viewGroup, false);
        RecyclerViewViewHolder recyclerViewViewHolder= new RecyclerViewViewHolder(view);
        return recyclerViewViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder recyclerViewViewHolder, int i) {
        RecyclerViewItem recyclerViewItem = arrayList.get(i);

        recyclerViewViewHolder.imageView.setImageResource(recyclerViewItem.getImageResourse());
        recyclerViewViewHolder.textView.setText(recyclerViewItem.getText1());
        recyclerViewViewHolder.textView2.setText(recyclerViewItem.getText2());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
