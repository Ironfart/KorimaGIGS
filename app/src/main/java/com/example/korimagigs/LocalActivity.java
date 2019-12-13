package com.example.korimagigs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LocalActivity extends AppCompatActivity {
    String[] taste = {
            "Locales",
            "Géneros",

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);
    }



}
