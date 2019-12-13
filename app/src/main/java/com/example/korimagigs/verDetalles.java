package com.example.korimagigs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class verDetalles extends AppCompatActivity {
TextView txtVwNombreArt, txtVwGen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_detalles);
        txtVwNombreArt=findViewById(R.id.txtNombreArt);
        txtVwGen=findViewById(R.id.txtVwGen);

        txtVwNombreArt.setText("");
        txtVwGen.setText("");
    }
}
