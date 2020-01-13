package com.example.cs;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class queue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);
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


    public void queue(View v)
    {
        Intent intent = new Intent(this, que.class);
        startActivity(intent);
    }

    public void testq(View v)
    {
        Intent intent = new Intent(this, testq.class);
        startActivity(intent);
    }

    public void pal(View v)
    {
        Intent intent = new Intent(this, qpal.class);
        startActivity(intent);
    }

    public void cqu(View v)
    {
        Intent intent = new Intent(this, cqu.class);
        startActivity(intent);
    }


}
