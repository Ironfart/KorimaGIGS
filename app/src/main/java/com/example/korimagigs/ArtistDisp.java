package com.example.korimagigs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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
    private Button btn;

    String[] user = {
            "Artistas",
            "Locales",
            "Preferencias",

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_disp);
        referenceD=FirebaseDatabase.getInstance().getReference("Artists");


        lstVwArt = findViewById(R.id.lstVwArtistas);
        btn=findViewById(R.id.btnMostrar);

        lstVwArt.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, user));
        lstVwArt.setOnItemClickListener(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        /*referenceD.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                String string=dataSnapshot.getValue(String.class);
                arrayList.add(string);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {
                String string=dataSnapshot.getValue(String.class);
                arrayList.remove(string);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
*/
        }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "asd", Toast.LENGTH_SHORT).show();
    }
}


