package com.example.examproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class CoustomizePage extends AppCompatActivity {

    ImageView back;
    RecyclerView recyclerView;
    ArrayList<String> Tyrename;
    String[] tireText = new String[] {"Chrome Wheels with Michelin tires","Brushed disc with nokian tires"};
    int[] img = new int[] {R.drawable.tyre,R.drawable.tyre2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coustomize_page);

        back = findViewById(R.id.back_arrow2);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CoustomizePage.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        recyclerView = findViewById(R.id.recycler);

        Tyrename = new ArrayList<>();
        Tyrename.add("Mercedes Stock");
        Tyrename.add("Custom RX468");


        LinearLayoutManager manager = new LinearLayoutManager(CoustomizePage.this);
        RecyclerAdapter adapter = new RecyclerAdapter(CoustomizePage.this,Tyrename,img,tireText);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
}