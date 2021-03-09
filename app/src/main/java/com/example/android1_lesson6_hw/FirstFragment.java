package com.example.android1_lesson6_hw;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FirstFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rv);
        MainAdapter adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(requireContext());
        recyclerView.setLayoutManager(manager);

        ArrayList<String> list = new ArrayList<>();
        list.add(0, "Name");
        list.add(0, "Name2");
        list.add(0, "Name3");
        list.add(0, "Name4");
        list.add(0, "Name5");
        list.add(0, "Name6");
        list.add(0, "Name7");
        list.add(0, "Name8");
        list.add(0, "Name9");
        list.add(0, "Name10");
        adapter.addText(list);

        return view;
    }
}