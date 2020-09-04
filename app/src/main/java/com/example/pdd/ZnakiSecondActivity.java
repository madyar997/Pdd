package com.example.pdd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class ZnakiSecondActivity extends AppCompatActivity  implements MyRecyclerViewAdapter.ItemClickListener{
    MyRecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_znaki_second);
    }

    @Override
    protected void onStart() {
        super.onStart();
        ArrayList<String> znakNames = new ArrayList<>();
        znakNames.add("Железнодорожный переезд со шлагбаумом");
        znakNames.add("Железнодорожный переезд без шлагбаума");
        znakNames.add("Однопутная железная дорога");
        znakNames.add("Многопутная железная дорога");
        znakNames.add("Приближение к железнодорожному переезду");
        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvZnaki);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, znakNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}
