package com.example.pdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class PddSecondActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdd_second);
        ListView listView = (ListView) findViewById(R.id.pdd_categorys);
        Intent intent = getIntent();
        Integer position = intent.getIntExtra("position");
        Log.d(TAG, "owojfffffffffvjjjjjjjjjjvvvvvv"+getIntent().getStringExtra("id"));
        TextView tv_pdd = (TextView) findViewById(R.id.tv_pdd);
        tv_pdd.setText(id);
    }

}


