package com.example.korimagigs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PrefActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    ListView lsPref;

    String[] taste = {
            "Artistas",
            "Locales",
            "Preferencias",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pref);

        lsPref = findViewById(R.id.lsPref);

        lsPref.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,taste));
        lsPref.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
        Toast.makeText(this, taste[pos], Toast.LENGTH_SHORT).show();
    }
}
