package com.example.examproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.DataHolder>{

    CoustomizePage coustomizePage;
    ArrayList<String> tyrename;
    String[] tireText;
    int[] img;

    public RecyclerAdapter(CoustomizePage coustomizePage, ArrayList<String> tyrename, int[] img, String[] tireText) {

        this.coustomizePage = coustomizePage;
        this.img = img;
        this.tyrename = tyrename;
        this.tireText = tireText;
    }

    @NonNull
    @Override
    public DataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(coustomizePage).inflate(R.layout.recycle_layout,parent,false);
        return new DataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataHolder holder, int position) {

        holder.textView.setText(tyrename.get(position));
        holder.textView2.setText(tireText[position]);
        Glide.with(coustomizePage).load(img[position]).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return tyrename.size();
    }

    class DataHolder extends RecyclerView.ViewHolder {

        TextView textView,textView2;
        ImageView imageView;
        public DataHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.recycle_text);
            textView2 = itemView.findViewById(R.id.recycle_text2);
            imageView = itemView.findViewById(R.id.tyre);
        }
    }
}
