package com.example.cs;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class linkedlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkedlist);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }


    public void single(View v)
    {
        Intent intent = new Intent(this, single.class);
        startActivity(intent);
    }
    public void doubl(View v)
    {
        Intent intent = new Intent(this, doublelist.class);
        startActivity(intent);
    }
}
