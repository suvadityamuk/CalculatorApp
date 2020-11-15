package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
    //public TextView souptext;

    public MainActivity() throws IOException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void add(View v)
    {
            EditText a = findViewById(R.id.op1);
            EditText b = findViewById(R.id.op2);
            double p = Double.parseDouble(a.getText().toString());
            double q = Double.parseDouble(b.getText().toString());
            double sum = p + q;
            ((EditText)findViewById(R.id.res)).setText(String.valueOf(sum));

    }
    public void sub(View v)
    {
        EditText a = findViewById(R.id.op1);
        EditText b = findViewById(R.id.op2);
        double p = Double.parseDouble(a.getText().toString());
        double q = Double.parseDouble(b.getText().toString());
        double diff = p - q;
        ((EditText)findViewById(R.id.res)).setText(String.valueOf(diff));

    }
    public void mul(View v)
    {
        EditText a = findViewById(R.id.op1);
        EditText b = findViewById(R.id.op2);
        double p = Double.parseDouble(a.getText().toString());
        double q = Double.parseDouble(b.getText().toString());
        double prod = p * q;
        ((EditText)findViewById(R.id.res)).setText(String.valueOf(prod));

    }
    public void div(View v)
    {
        EditText a = findViewById(R.id.op1);
        EditText b = findViewById(R.id.op2);
        double p = Double.parseDouble(a.getText().toString());
        double q = Double.parseDouble(b.getText().toString());
        double quot = p / q;
        ((EditText)findViewById(R.id.res)).setText(String.valueOf(quot));
    }
   
}

