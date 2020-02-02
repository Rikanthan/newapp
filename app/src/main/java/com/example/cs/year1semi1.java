package com.example.cs;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class year1semi1 extends AppCompatActivity {
private Button button3;
private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year1semi1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




    }
        public void arith(View v)
        {
            Intent intent = new Intent(this, arith.class);
            startActivity(intent);
        }






    public  void max(View v)
    {
        Intent intent=new Intent(this, max.class);
        startActivity(intent);
    }
    public  void sum(View v)
    {
        Intent intent=new Intent(this, sum.class);
        startActivity(intent);
    }

    public  void multi(View v)
    {
        Intent intent=new Intent(this, multiplicationtable.class);
        startActivity(intent);
    }


    public  void prime(View v)
    {
        Intent intent=new Intent(this, checkprime.class);
        startActivity(intent);
    }

    public  void fact(View v)
    {
        Intent intent=new Intent(this, factorial.class);
        startActivity(intent);
    }

    public  void checksign(View v)
    {
        Intent intent=new Intent(this, checksign.class);
        startActivity(intent);
    }


    public  void checkmax(View v)
    {
        Intent intent=new Intent(this, checkmax.class);
        startActivity(intent);
    }

    public  void righttriangle(View v)
    {
        Intent intent=new Intent(this, checkrighttriangle.class);
        startActivity(intent);
    }

    public void arrays(View v)
    {
        Intent intent=new Intent(this, arr.class);
        startActivity(intent);
    }
















}





