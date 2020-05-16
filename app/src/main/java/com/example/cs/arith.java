package com.example.cs;

import android.os.Bundle;
import android.content.ClipboardManager;
import android.content.ClipData;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class arith extends AppCompatActivity {
    private ClipboardManager myClipboard;
    private ClipData myClip;
    TextView arith;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arith);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        arith=(TextView) findViewById(R.id.arith);
        setSupportActionBar(toolbar);
        myClipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text;
                text = arith.getText().toString();

                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);

                Toast.makeText(getApplicationContext(), "Text Copied",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
