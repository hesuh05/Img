package com.example.customlists;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import kotlin.collections.ArrayDeque;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        List<Element> elements = new ArrayList<Element>();
        elements.add(new Element("Russian","Caravan Palace",R.drawable.caravan));
        elements.add(new Element("Stolen Dance","Milky Chance",R.drawable.milky));
        elements.add(new Element("The Shapes Rap","Geometry",R.drawable.stella));
        elements.add(new Element("The Bright Side of The Sun","Pink Floyd",R.drawable.floyd));
        elements.add(new Element("Dont Let Me Down","The Beatles",R.drawable.beatles));
        recyclerView = findViewById(R.id.rv_songs);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),elements));
    }
}