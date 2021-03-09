package com.example.android1_lesson6_hw;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.rv_2);
        MainAdapterNumbers adapter = new MainAdapterNumbers();
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(requireContext());
        recyclerView.setLayoutManager(manager);

        ArrayList<String> list = new ArrayList<>();
        list.add(0, "1");
        list.add(0, "2");
        list.add(0, "3");
        list.add(0, "4");
        list.add(0, "5");
        list.add(0, "6");
        list.add(0, "7");
        list.add(0, "8");
        list.add(0, "9");
        list.add(0, "10");
        adapter.addText(list);


        return view;
    }
}