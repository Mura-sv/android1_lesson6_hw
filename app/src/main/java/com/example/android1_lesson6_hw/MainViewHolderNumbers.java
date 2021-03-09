package com.example.android1_lesson6_hw;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolderNumbers extends RecyclerView.ViewHolder {

    TextView simpleText;

    public MainViewHolderNumbers(@NonNull View itemView) {
        super(itemView);

        simpleText = itemView.findViewById(R.id.tv_numbers);

    }

    public void onBind(String data) {
        simpleText.setText(data);
    }
}
