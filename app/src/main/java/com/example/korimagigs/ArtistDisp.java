package com.example.korimagigs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



import java.util.ArrayList;

public class ArtistDisp extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView lstVwArt;
    private DatabaseReference referenceD;
    private ArrayList<String> arrayList = new ArrayList<>();
    private ArrayAdapter<String> adapter;
    Intent in1,in2,in3,in4;

    String[]user = {
            "Khalighula",
            "Metallica",
            "Caifanes",
            "Ajsdkjfc"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_disp);

        lstVwArt = findViewById(R.id.lstVwArtistas);


        lstVwArt.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, user));
        lstVwArt.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "asd", Toast.LENGTH_SHORT).show();
        switch (i) {
            case 0:
                in1 = new Intent(ArtistDisp.this, verDetalles.class);
                startActivity(in1);
                break;
            case 1:
                in2 = new Intent(ArtistDisp.this, verDetalles.class);
                startActivity(in2);
                break;
            case 2:
                in3 = new Intent(ArtistDisp.this, verDetalles.class);
                startActivity(in3);
                break;
            case 3:
                in4 = new Intent(ArtistDisp.this, verDetalles.class);
                startActivity(in4);

                break;
        }
    }
}