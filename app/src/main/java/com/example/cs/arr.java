package com.example.cs;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class arr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arr);




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }


    public void insertion(View v)
    {
        Intent intent=new Intent(this, insertion.class);
        startActivity(intent);
    }



    public void reverse(View v)
    {
        Intent intent=new Intent(this, reverse.class);
        startActivity(intent);
    }


    public void maxmin(View v)
    {
        Intent intent=new Intent(this, mx.class);
        startActivity(intent);
    }

    public void square(View v)
    {
        Intent intent=new Intent(this, square.class);
        startActivity(intent);
    }

    public void search(View v)
    {
        Intent intent=new Intent(this, search.class);
        startActivity(intent);
    }

    public void palindrome(View v)
    {
        Intent intent=new Intent(this, palindrome.class);
        startActivity(intent);
    }

    public void ascending(View v)
    {
        Intent intent=new Intent(this, ascending.class);
        startActivity(intent);
    }


}
