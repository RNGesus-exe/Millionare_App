package com.rngesus.millionareApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class Catagory extends AppCompatActivity {
    private Button random;
    private category_recycler_view category_recycler;
    private FragmentManager fragment_manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagory);
        random=findViewById(R.id.random);

        fragment_manager=this.getSupportFragmentManager();  //ASK SIR
        category_recycler = (category_recycler_view) fragment_manager.findFragmentById(R.id.category_fragment);

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand=new Random();
               int n= rand.nextInt(7);
                Toast.makeText(Catagory.this, ""+n, Toast.LENGTH_SHORT).show();

            }
        });
    }
}