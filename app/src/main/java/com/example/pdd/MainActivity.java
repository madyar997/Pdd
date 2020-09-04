package com.example.pdd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MyRecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btn_pdd(View view) {
        Intent intent = new Intent(this, PddActivity.class);
        startActivity(intent);
    }
    public void btn_znaki(View view) {
        Intent intent = new Intent(this, CategoryZnakiActivity.class);
        startActivity(intent);
    }
    public void btn_test(View view) {
        Intent intent = new Intent(this, TestActivity.class);
        startActivity(intent);
    }


}