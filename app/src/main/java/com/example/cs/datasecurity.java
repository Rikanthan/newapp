package com.example.cs;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class datasecurity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datasecurity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public  void ceasar(View v)
    {
        Intent intent=new Intent(this, ceasar.class);
        startActivity(intent);
    }

    public  void playfair(View v)
    {
        Intent intent=new Intent(this, playfair.class);
        startActivity(intent);
    }

    public  void key(View v)
    {
        Intent intent=new Intent(this, key.class);
        startActivity(intent);
    }

    public  void hill(View v)
    {
        Intent intent=new Intent(this, hill.class);
        startActivity(intent);
    }

    public  void rail(View v)
    {
        Intent intent=new Intent(this, rail.class);
        startActivity(intent);
    }




}
