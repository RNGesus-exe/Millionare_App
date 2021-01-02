package com.rngesus.millionareApp;

import android.app.Application;

import java.util.ArrayList;

public class DataManager extends Application {
    public static ArrayList<String> category_names_arr;

    @Override
    public void onCreate() {
        super.onCreate();

        category_names_arr = new ArrayList<>();
        category_names_arr.add("Programming");
        category_names_arr.add("Object Orientated");
        category_names_arr.add("Data Structures");
        category_names_arr.add("Algorithms");
        category_names_arr.add("Mobile Development");
        category_names_arr.add("Ubuntu");
        category_names_arr.add("Machine Learning");
    }
}
