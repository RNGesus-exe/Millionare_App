package com.rngesus.millionareApp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class category_recycler_view extends Fragment {

    private RecyclerView category_recycler;
    private RecyclerView.Adapter category_adapter;
    private RecyclerView.LayoutManager category_manager;
    private View category_view;


    public category_recycler_view() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        category_view = inflater.inflate(R.layout.fragment_category_recyler_view, container, false);
        return category_view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        category_recycler = category_view.findViewById(R.id.rv_category);
        category_recycler.setHasFixedSize(true);
        category_manager = new LinearLayoutManager(this.getActivity());
        category_recycler.setLayoutManager(category_manager);
        category_adapter = new category_adapter(this.getContext());
        category_recycler.setAdapter(category_adapter);
    }
}