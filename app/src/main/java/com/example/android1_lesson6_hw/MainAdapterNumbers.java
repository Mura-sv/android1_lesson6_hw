package com.example.android1_lesson6_hw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapterNumbers extends RecyclerView.Adapter<MainViewHolderNumbers> {

    ArrayList<String> list = new ArrayList<>();

    public void addText(ArrayList<String> data) {
        list = data;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MainViewHolderNumbers onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_numbers, parent, false);
        return new MainViewHolderNumbers(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolderNumbers holder, int position) {
        holder.onBind(list.get(position));
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
