package com.example.cs;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class sorting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting);
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
    public void selection(View v)
    {
        Intent intent = new Intent(this, selection.class);
        startActivity(intent);
    }
    public void insertion(View v)
    {
        Intent intent = new Intent(this, insertion_sort.class);
        startActivity(intent);
    }
    public void bubble(View v)
    {
        Intent intent = new Intent(this, bubble.class);
        startActivity(intent);
    }
    public void heap(View v)
    {
        Intent intent = new Intent(this, heap.class);
        startActivity(intent);
    }
    public void quick(View v)
    {
        Intent intent = new Intent(this, quick.class);
        startActivity(intent);
    }
    public void merge(View v)
    {
        Intent intent = new Intent(this, merge.class);
        startActivity(intent);
    }
}
