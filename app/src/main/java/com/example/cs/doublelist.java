package com.example.cs;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class doublelist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doublelist);

    }


    public void node(View v)
    {
        Intent intent = new Intent(this, node.class);
        startActivity(intent);
    }

    public void doublel(View v)
    {
        Intent intent = new Intent(this, doublelink.class);
        startActivity(intent);
    }
    public void Testdouble(View v)
    {
        Intent intent = new Intent(this, testdouble.class);
        startActivity(intent);
    }


}
