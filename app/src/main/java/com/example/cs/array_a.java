package com.example.cs;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class array_a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_a);



    }


    public void insrt(View v)
    {
        Intent intent = new Intent(this, insrt.class);
        startActivity(intent);
    }

    public void duplicate(View v)
    {
        Intent intent = new Intent(this, duplicate.class);
        startActivity(intent);
    }

    public void common1(View v)
    {
        Intent intent = new Intent(this, common1.class);
        startActivity(intent);
    }

    public void common2(View v)
    {
        Intent intent = new Intent(this, common2.class);
        startActivity(intent);
    }












}
