package com.gavilan.actividad1final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ActivityVer extends AppCompatActivity {
    RecyclerView recyclerMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver);

        recyclerMascotas = findViewById(R.id.recyclerMascotas);

        recyclerMascotas.setLayoutManager(new LinearLayoutManager(ActivityVer.this));

        AdaptadorMascotas adaptadorMascotas = new AdaptadorMascotas(MainActivity.ArrayMascotas);

        recyclerMascotas.setAdapter(adaptadorMascotas);

    }
}