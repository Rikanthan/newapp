package com.example.cs;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class year1semi2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year1semi2);
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
    public void array(View v)
    {
        Intent intent = new Intent(this, array_a.class);
        startActivity(intent);
    }

    public void queue(View v)
    {
        Intent intent = new Intent(this, queue.class);
        startActivity(intent);
    }

    public void linkedlist(View v)
    {
        Intent intent = new Intent(this, linkedlist.class);
        startActivity(intent);
    }

    public void tree(View v)
    {
        Intent intent = new Intent(this, tree.class);
        startActivity(intent);
    }
    public void search(View v)
    {
        Intent intent = new Intent(this, srch.class);
        startActivity(intent);
    }






}
