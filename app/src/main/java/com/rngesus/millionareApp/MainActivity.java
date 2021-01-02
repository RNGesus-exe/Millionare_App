package com.rngesus.millionareApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt1,txt2,txt3,txt4;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        txt1.setText("There will be a total of 10 Questions");
        txt2.setText("If you get a question wrong its GAME OVER");
        txt3.setText("You get 100 points for getting a question correct");
        txt4.setText("You have 3 helplines");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Catagory.class);
                startActivity(intent);
            }
        });
    }
    void init()
    {
        txt1=findViewById(R.id.Rule1);
        txt2=findViewById(R.id.Rule2);
        txt3=findViewById(R.id.Rule3);
        txt4=findViewById(R.id.Rule4);
        btn=findViewById(R.id.btnPlay);
    }

}